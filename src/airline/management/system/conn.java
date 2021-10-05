package airline.management.system;



import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4","root","@9869540717a");
            s =c.createStatement();



        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new conn();
    }
}


