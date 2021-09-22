//SingletonClass
 class SingletonClass {
    private static SingletonClass singletonInst = new SingletonClass();

    private SingletonClass() {
System.out.println("Hello");
    }
    public static SingletonClass getSingletonInst() {
        return singletonInst;
    }
}
 public class Q4 {
        public static void main(String[] args){
            SingletonClass t = SingletonClass.getSingletonInst();
        }
 }
