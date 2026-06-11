@FunctionalInterface
 interface A{
    void show(int i);
}
public class lambda{
    public static void main(String[] args) {
        // Lambda(->)  expression to implement a functional interface 
        // compiler understands that we are implementing the show() method of the A interface
        A obj = (i) -> System.out.println("hello" + " " + i);
        obj.show(5);
    }
}
// 3 types of interfaces
// 1) Normal interface -> can have multiple abstract methods
// 2) Functional interface -> can have only one abstract method
// functional interface is also called as SAM (Single Abstract Method) interface
// 3) Marker interface -> (blank interface which has no methods) does not have any abstract method, 
// it is used to mark a class for a specific purpose