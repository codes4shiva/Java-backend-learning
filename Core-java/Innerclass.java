class A{
    public void show(){
        System.out.println("I am in class A");
    }
}
public class Innerclass {
    public static void main(String[] args){
        A obj = new A()
        {
            public void show(){
                System.out.println("I am in class B");
            }
        };
        obj.show();
    }
}
