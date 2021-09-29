
interface InterfaceC{
    int say(int c,int d);
}

public class ReferenceEx {
    public static void main(String[] args) {
     ReferenceEx object = new ReferenceEx();
        InterfaceC obj = object :: addition;
        System.out.println(obj.say(5,6));
        InterfaceC obj1 = object :: subtract;
        System.out.println(obj.say(9,5));
        InterfaceC obj2 = ReferenceEx :: multiplication;
        System.out.println(obj.say(9,5));
    }
    static int multiplication(int a, int b) {
        return a * b;
    }

    int addition(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

}