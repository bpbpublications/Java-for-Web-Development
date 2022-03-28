
import java.awt.*;
import java.awt.event.*;
import java.sql. *; 
public class QueryApp3 extends Frame implements ActionListener{  
  TextField eid,ename;
  Button next;
  Panel p;
  static ResultSet result;
  static Connection con;
  static Statement stat;
  public QueryApp3(){
    super("The Query Application");
    setLayout(new GridLayout(5,1));
    eid=new TextField();
    ename=new TextField();
    next=new Button("Next");
    setSize(500,500);
    p=new Panel();
    add(new Label("Employee ID"));
    add(eid);
    add(new Label ("Employee Name: "));
    add(ename);
    add(p);
    p.add(next);
    next.addActionListener(this);
    setVisible(true);  
  }
  public static void main (String a [] )
  { 
    QueryApp3 ab=new QueryApp3();
    try  {
  Class. forName("oracle.jdbc.driver.OracleDriver"); 
  System.out.println("after Driver");
  con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","sail_boat1");
  stat = con.createStatement(); 
  System.out.println("after statement");
  result=stat.executeQuery("select * from emp");
    }
  catch(Exception e)
  {System.out.print ("Error in sql" + e);}}
  @Override
  public void actionPerformed(ActionEvent event) {
    
    if(event.getSource()==next)
    {
      try{
        while( result.next())
        {
          eid.setText(eid.getText()+"  "+(result.getString(1)));
          ename.setText(ename.getText()+"  "+(result.getString(2)));
        }
      }catch(Exception e){System.out.println(e);}
    }
    }
    }
