class Counter {
    int count;

    public synchronized void increment() {
        // we have used synchronized to avoid race condition and to
        // make sure that only one thread can access this method at a time
        count++;
    }
}

public class racecondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i <= 10000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 10000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join(); // we use join to wait for the threads to
        // finish before printing the count
        t2.join();
        System.out.println(c.count);
    }
}
