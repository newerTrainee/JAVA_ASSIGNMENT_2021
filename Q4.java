import java.text.DecimalFormat;

public class Q4{

    static void charPercentage(String str) {
        int length = str.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }

        System.out.println("number of uppercase:" + upperCase);
        System.out.println("number of lowercase:" + lowerCase);
        System.out.println("number of digits:" + digits);
        System.out.println("number of others:" + others);

        double UCP = (upperCase * 100) / length;
        double LCP = (lowerCase * 100) / length;
        double DP = (digits * 100) / length;
        double OC = (others * 100) / length;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + str + "' : ");
        System.out.println("Uppercase letters are " + format.format(UCP) + "% ");
        System.out.println("Lowercase letters are " + format.format(LCP) + "%");
        System.out.println("Digits Are " + format.format(DP) + "%");
        System.out.println("Other Characters Are " + format.format(OC) + "%");

    }
    public static void main(String[] args) {
        charPercentage("chauhan.2000@gmail.com");
    }

}