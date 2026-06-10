interface Computer{
     void process();
}
class laptop implements Computer{
    public void process(){
        System.out.println("Compile : run");
    }
}
class dekstop implements Computer{
    public void process(){
        System.out.println("compile : run : faster");
    }
}

public class coupling {
    public static void main(String[] args){
        Computer employee1 = new laptop();
        Computer employee2 = new dekstop();
        employee1.process();
        employee2.process();
    }
}
