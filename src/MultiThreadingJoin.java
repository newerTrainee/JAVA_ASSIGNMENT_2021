public class MultiThreadingJoin implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadingJoin());
        t1.start();
        try{
            for(int i=0;i<10;i++){
                t1.join();
                System.out.println(Thread.currentThread());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}