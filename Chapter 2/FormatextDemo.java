import java.text.NumberFormat;
import java.util.Locale;
public class FormatextDemo {
  public static void main(String[] args) 
{
    Locale l=new Locale(args[0],args[1]);
    NumberFormat nf=NumberFormat.getNumberInstance(l);
    String num=nf.format(123456789.12345);
    System.out.println("Number for "+args[0] +" " +args[1]+" : "+ num);
    //Currency Format
    NumberFormat nf2=NumberFormat.getCurrencyInstance(l);
    String num2=nf2.format(123456789.12345);
    System.out.println("Currency of  "+args[0] +" " +args[1]+" : "+ num2);
    //Percent Format
    
    NumberFormat nf3=NumberFormat.getPercentInstance(l);
    String num3=nf3.format(123456789.12345);
    System.out.println("Percent Format of   "+args[0] +" " +args[1]+" : "+ num3);
  }    }

