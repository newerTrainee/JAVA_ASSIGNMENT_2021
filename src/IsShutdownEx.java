import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class IsShutdownEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 50 ; i++) {
            executorService.submit(() -> {
                System.out.println("Doing through executor");
            });
        }

        for(int j=0;j<20;j++) {
            executorService.submit(() -> {
                System.out.println("Again Doing Through executer");
            });
        }
        executorService.shutdown();
        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
    }
}

