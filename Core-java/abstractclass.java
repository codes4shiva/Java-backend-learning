abstract class A{
    public abstract void show();
}
abstract class B {
    public void type(){
        System.out.println("in B");
    }
}
class C extends B{
    public void type1(){
        System.out.println("in c");
    }
}

public class abstractclass{
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("in A");
            }
        };
        obj.show();
       // B obj1 = new B(); // this will give error bcoz u cannot create object of abstract class 
        C obj2 = new C();
        obj2.type(); // you can use abstract clasa method by extending it in another class and creating object of that class
        obj2.type1();
    }
}