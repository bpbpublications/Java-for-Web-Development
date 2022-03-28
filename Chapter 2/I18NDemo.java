import java.util.Locale;
import java.util.ResourceBundle;
public class I18NDemo {
public static void main(String[] args) {
//Default Locale is the US
ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
System.out.println("Message in " + Locale.US + ": " + bundle.getString("welcome"));

// Now the default locale change to India 
Locale.setDefault(new Locale("hi", "IN"));
bundle = ResourceBundle.getBundle("MessageBundle");
System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("welcome"));

}}

