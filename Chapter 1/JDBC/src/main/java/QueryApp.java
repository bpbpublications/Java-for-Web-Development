
import java.sql. *; 
public class QueryApp {
   
  public static void main (String a [] )
  {
    try  {
  Class. forName("oracle.jdbc.driver.OracleDriver"); 
  
  Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","sail_boat1");
  Statement stat = con.createStatement(); 
  stat.executeQuery ("select * from emp");
  }
  catch(Exception e)
  {System.out.print ("Error" + e);
  }
  }
  }

