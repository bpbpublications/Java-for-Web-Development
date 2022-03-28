import java.util.Locale;
public class LocaleTest {
  public static void main(String[] args) {    
    Locale locale=new Locale("hi","IN");
    System.out.println(locale.getDisplayCountry());  
    System.out.println(locale.getDisplayLanguage());  
    System.out.println(locale.getDisplayName());  
    System.out.println(locale.getISO3Country());  
    System.out.println(locale.getISO3Language());  
    System.out.println(locale.getLanguage());  
    System.out.println(locale.getCountry());  
}}


