public class exceptionhandling {
    public static void main(String[] args){
        int i = 0;
        int j = 0 ;
        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("hello world");
    }
}
//runtime error is called as exception
// exception handling is a mechanism to handle runtime errors and maintain
// the normal flow of the program
