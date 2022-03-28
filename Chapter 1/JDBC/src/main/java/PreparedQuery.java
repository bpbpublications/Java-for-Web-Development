import java.sql.*;
import java.awt.*;
import java.awt. event.*;
public class PreparedQuery extends Frame implements ActionListener
{
TextField eid, ename; 
Button query;
Panel p;
/* These variables are declared as static because theyhave to be accessed in a static method*/
static ResultSet result; 
static Connection con; 
static PreparedStatement stat;
/* The constructor of the Prepared Query App class */
public  PreparedQuery()
{ 
  super("The Query Application");
  setLayout(new GridLayout(5,1));
  eid=new TextField();
  ename=new TextField();
  query=new Button("QUERY");
  setSize(500,500);
  p=new Panel();
  add(new Label("Employee ID"));
  add(eid);
  add(new Label ("Employee Name: "));
  add(ename);
  add(p);
  p.add(query);
  query.addActionListener(this);
  setVisible(true);
}
/* The main method creates an object of the class and displays the first record*/
public static void main (String a [] )
{
  PreparedQuery obj = new PreparedQuery( ); 
try {
  Class.forName("oracle.jdbc.driver.OracleDriver"); 
  con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","sail_boat1");
  stat = con.prepareStatement ("select * from emp where id= ?");
}
catch(Exception e)
{
System. out. print ("Error in sql" + e);
}
}
@Override
public void actionPerformed(ActionEvent event) {
  
  if(event.getSource()==query)
  {
    try{
      stat.setString(1,eid.getText());
      result=stat.executeQuery();
      while(result.next())
      {
        eid.setText(result.getString(1));
        ename.setText(result.getString(2));
      }
    }catch(Exception e){System.out.println(e);}
  }
  }
}

