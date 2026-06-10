enum Status{
    Running, failed , pending;
}
public class classenum {
    public static void main(String[] args){
       Status s = Status.Running;
       System.out.println(s);
       System.out.println(s.ordinal());
    }
}
