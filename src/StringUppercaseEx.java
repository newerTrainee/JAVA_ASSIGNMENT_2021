import java.util.Locale;

interface Interface3{
    String uppercase(String s);
}

public class StringUppercaseEx {
    public static void main(String[] args){
        Interface3 obj = (String string) -> {
          return string.toUpperCase();
        };
        System.out.println(obj.uppercase("unitedstates"));
    }
}
