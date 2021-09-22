/*Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String */
public class Q10 {
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static double mul(double a, double b){
        return a*b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static String concat(String a,String b){
        return a.concat(b);
    }
     static String concat(String a,String b,String c){
        String d= a.concat(b);
        return d.concat(c);
     }
    public static void main(String[] args){
      System.out.println(add(4,5));
        System.out.println(add(33.4567,45.56455));
        System.out.println(mul(12.0,11.0));
        System.out.println(mul(3,7));
        System.out.println(concat("sumit","Chauhan"));
        System.out.println(concat("Sumit","Kumar","Chauhan"));

    }
}
