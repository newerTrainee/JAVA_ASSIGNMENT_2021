import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String random = input.nextLine();
        char a =input.next().charAt(0);
        String b = random.replace(a,' ');
        String d =b.replaceAll("\\s","");
        int c =random.length()-d.length();
        System.out.println(d);
        System.out.println("The no. of Occurance of a character: "+c);
    }
}
