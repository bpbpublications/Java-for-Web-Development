import java.util.Locale;
import java.text.DateFormat;
public class DateFormatDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String lang="en";
    String country="US";
Locale l=new Locale(lang,country);
DateFormat df= DateFormat.getDateInstance(DateFormat.LONG,l);
String dt=df.format(new java.util.Date());
System.out.println(dt);
// Time

DateFormat df2= DateFormat.getTimeInstance(DateFormat.LONG,l);
String time=df2.format(new java.util.Date());
System.out.println(time);
  }}

