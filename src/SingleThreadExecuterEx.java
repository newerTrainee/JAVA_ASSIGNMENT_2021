import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Task1 Started");
        for(int i=0;i<20;i++){
            System.out.println(i);
        }
        System.out.println("Task1 Completed");
    }
}

public class SingleThreadExecuterEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Task());
        //Task 2
        System.out.println("Task2 Executed");
        System.out.println("Taske Completed");
    }
}