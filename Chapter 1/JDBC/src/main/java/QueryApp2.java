import java.sql. *; 
public class QueryApp2 {
  
  
  public static void main (String a [] )
  { ResultSet result;
    try  {
  Class.forName("oracle.jdbc.driver.OracleDriver"); 
  
  Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","sail_boat1");
  Statement stat = con.createStatement(); 
  result=stat.executeQuery ("select * from emp");
  while(result.next())
  {    
    System.out.println(result.getString(2));/* retrieving data from 2nd Col. of emp table*/
  }
  }
  catch(Exception e)
  {System.out.println ("Error" + e);}  }}
