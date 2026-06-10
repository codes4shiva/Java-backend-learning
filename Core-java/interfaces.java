interface A {
    public abstract void mthd1(); // u can write without abstract keyword also bcoz by default
    // all methods in interface are abstract

    void mthd2();
}

// class -> classs -> extends
// class -> interface -> implements
// interface -> interface -> extends
interface B extends A {
    void mthd3();
}

class c implements B {
    public void mthd1() {
        System.out.println("in mthd1");
    }

    public void mthd2() {
        System.out.println("in mthd2");
    }

    public void mthd3() {
        System.out.println("in mthd3");
    }
}

public class interfaces {
    public static void main(String[] args) {
        c obj = new c();
        obj.mthd1();
        obj.mthd2();
    }
}
