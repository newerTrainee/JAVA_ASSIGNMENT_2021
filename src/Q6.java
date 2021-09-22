public class Q6 {
    public static void main(String[] args){
        int a=30;
        int b;
        try {
            b = a/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This statement must called!");
        }
        System.out.println("Rest of the code");
    }
}
