// First number is greater than second number or not
interface Interface{
    void findGreater(int a,int b);
}

public class LamdaEx {
    public static void main(String[] args) {
        Interface obj = (int a, int b) -> {
            if (a > b) {
                System.out.println(a + " is greater than" + b);
            } else
                System.out.println(b + " is grater than " + a);
        };
        obj.findGreater(10,45);
    }
}
