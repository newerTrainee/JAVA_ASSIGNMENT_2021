import java.text.*;
import java.util.*;

class FormatDate
{
    public static void main(String[] args)
    {
        SimpleDateFormat geek = new SimpleDateFormat("dd-MM-YY");
        Calendar c = Calendar.getInstance();
        String formattedDate = geek.format(c.getTime());
        System.out.println("Date formatted : "+formattedDate);
 /*

        System.out.println("Present Date : " + c.getTime()); */
    }
}