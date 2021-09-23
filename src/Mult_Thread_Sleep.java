public class Mult_Thread_Sleep implements Runnable {
    @Override
    public void run() {
        try{
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            Thread.sleep(200);
        }
           }
              catch (Exception e){
                  System.out.println(e);
              }
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(new Mult_Thread_Sleep());
        t2.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
