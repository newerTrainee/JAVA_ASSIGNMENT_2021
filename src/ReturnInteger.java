interface Interface4{
    int returnInteger(int a,int b);
}
public class ReturnInteger {
    public static void main(String[] args) {
        Interface4 obj = (int a, int b) -> {
            return a + b;
        };
        System.out.println(obj.returnInteger(5,8));
    }
}
