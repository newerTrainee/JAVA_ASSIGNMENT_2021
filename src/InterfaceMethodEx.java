interface MyInterface{
    public default void display(){
        System.out.println("Interface default method is called");
    }
    public static void show(){
        System.out.println("Interface Static method is called");
    }
}

public class InterfaceMethodEx implements MyInterface {
//Override Interfave Default method
   /* public void display() {
        System.out.println("Class Display method is called");
    } */

    public static void main(String[] args) {
        InterfaceMethodEx obj = new InterfaceMethodEx();
        obj.display();
        MyInterface.show();
    }
}