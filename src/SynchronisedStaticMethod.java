public class SynchronisedStaticMethod {
    private static Integer a = 0;

    private synchronized static void increment() {
        a++;
    }

    private synchronized static void decrement() {
        a--;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                decrement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Value of Integer: " + a);
    }
}
