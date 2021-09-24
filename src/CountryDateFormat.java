import sun.nio.cs.US_ASCII;

import java.text.*;
import java.util.*;
public class CountryDateFormat {
    public static void main(String[] args){
        Locale locale = new Locale("EN","US");
        System.out.println("locale: "+locale);
        System.out.println("Country: "+locale.getDisplayCountry());
        System.out.println("Language: "+locale.getDisplayLanguage());
        Date d1 = new Date();
        DateFormat df =  DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(df.format(d1));

        }

    }
