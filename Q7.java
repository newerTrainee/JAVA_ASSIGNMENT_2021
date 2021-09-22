public class Q7 {
    static String firstName;
    static String lastName;
    static int age;
    static {
        System.out.println("Static block invoked");
        firstName ="sumit";
        lastName = "chauhan";
        age = 22;
        System.out.println(firstName+" "+lastName+" "+age);
    }
    static void print(){
        System.out.println("Static method called");
        System.out.println(firstName+" "+lastName+" "+age);
    }
    public static void main(String[] args){
       Q7.print();
       System.out.println("Static variables called now");
       System.out.print(Q7.firstName+" ");
       System.out.print(Q7.lastName+" ");
       System.out.println(Q7.age);
    }
}
