import java.util.Scanner;

public class Q7 {

    static void formatChange(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hrs = n / 3600;

        n %= 3600;
        int min = n / 60 ;

        n %= 60;
        int sec = n;

        System.out.println(day+" "+"days "+ hrs+ " " + "hrs " + min + " "
                + "min "+sec+" "+ "sec ");
    }

    public static void main (String[] args) {
        // Given n is in seconds
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. of Sec u want to covert: ");
        int n = in.nextInt();
        formatChange(n);
    }
}