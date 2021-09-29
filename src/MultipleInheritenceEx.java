interface InterfaceA{
    public default void priority(){
        System.out.println("InterfaceA is on priority");
    }
}
interface InterfaceB{
 public default void priority(){
     System.out.println("InterfaceB is on priority");
 }
}
public class MultipleInheritenceEx implements InterfaceA,InterfaceB
{
    public void priority(){
        System.out.println("Class method is called");
        InterfaceA.super.priority();
    }
public static void main(String[] args){
        MultipleInheritenceEx obj = new MultipleInheritenceEx();
        obj.priority();
}
}
