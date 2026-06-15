import java.io.*;
public class tryandfinally {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        int num = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }
        // finally block is always gets executed whether exception is handled or not,
        // it is used to close the resources like file, database connection etc.
    }
}
