interface Interface2{
    String concatThat(String s,String t);
}
public class ConcatinateEx {
    public static void main(String[] args) {
        Interface2 obj = (String string, String string1) -> {
            String modString = string.concat(string1);
            return modString;
        };
        System.out.println(obj.concatThat("Hello","Everyone"));
    }
}