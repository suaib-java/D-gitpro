import oracle.jdbc.driver.OracleDriver;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class ConnectionDemo{
   public static void main(String[]args){
   try{
   
   Driver d=new OracleDriver();
   DriverManager.registerDriver(d);//first step registering driver here
    System.out.println("register is created");
    Connection con=DriverManager.getConnection
   ("jdbc:oracle:thin:@localhost:1521:xe","system","system");//second stepestablishing the connetion
    System.out.println("connection is created");
    con.createStatement();
      System.out.println("statement is created");
    }
     catch(SQLException sqle){
    System.out.println(sqle);
   }
    


}


}