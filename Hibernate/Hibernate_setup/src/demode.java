import java.sql.*;

import static java.lang.Class.forName;

public class demode {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    /*
    import packages
    load and register
    create connection
    create statement
    execute statement
    process and results
    close
     */
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname = "postgres";
        String pass = "rootshiv123";
        String sql = "select * from student";
        String sql1 = "insert into student values(4,'Shiv',21)";
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to database.");
        Statement st = con.createStatement();
        boolean status =  st.execute(sql);
        System.out.println("Data is inserted");
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String name = rs.getString(2);
            int age = rs.getInt(3);
            int id = rs.getInt(1);
            System.out.println("Id is : " + id +  " - Name is : " + name + " - Age is :" + age);
        }
        con.close();
        System.out.println("Connection closed.");
    }
}
