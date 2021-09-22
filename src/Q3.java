public class Q3 {
    public static void main(String args[]) {
        /* try
        {
            Class.forName("Checking for Exception");
        }
        catch (ClassNotFoundException ex)
        {
           System.out.print(ex);    //class not found exception
                   } */
        Check obj = new Check();
        obj.test();
}
}
class Check {
    void test(){
        System.out.println("hello EveryONe"); //NoclassDEfFound  Error
    }
}