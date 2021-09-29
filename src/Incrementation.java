interface Increment1{
    int increment(int n);
}
public class Incrementation {
    public static void main(String[] args) {
        Increment1 obj = (int n) -> {
            return ++n;
        };
        System.out.println(obj.increment(7));
    }
}