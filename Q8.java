public class Q8
{
    public static void main(String args[])
    {
        StringBuffer sbf = new StringBuffer("Sumit Chauhan");
        System.out.println("String buffer = " + sbf);

        // Here it reverses the string buffer
        String reverseString = sbf.reverse().toString();
        char[] character = new char[reverseString.length()-6];
        for(int i=0; i<reverseString.length(); i++)
        {
            if(i<4 )
            {
                character[i] = reverseString.charAt(i);
            }

            if(i>9)
            {
                character[i-6] = reverseString.charAt(i);
            }
        }

        String newlysortedString = new String(character);
        System.out.println("String after reversing and removing index from4-9 :  = " + newlysortedString);



    }
}