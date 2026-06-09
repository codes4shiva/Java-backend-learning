class A{
    int age;
    public void show(){
        System.out.println("I am in class A");
    }
    static class B{
        public void display(){
            System.out.println("I am in class B");
        }
    }
}
public class Classhandling{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        // A.b obj1 = obj.new B() // this is also correct but we can directly call the 
        // static class without creating an object of the outer class
        obj1.display();
    }
}