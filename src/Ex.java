//Creating Thread using Thread class And Runnable Interface

import static java.lang.Object.*;

/*  public class Ex extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) throws InterruptedException {
        Ex thread = new Ex();
        Ex t1 = new Ex();

        thread.start();
    }
} */
class Ex implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");

        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
    public static void main(String[] args)
    {

            Thread object = new Thread(new Ex());
        int i=0;
            while(i<5) {
                object.start();
            i++;
        }

    }
}