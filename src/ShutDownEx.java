import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ShutDownEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 50 ; i++) {
            executorService.submit(() -> {
                System.out.println("Doing through executor");
            });
        }
        executorService.shutdownNow();
        //executorService.shutdown();
        for(int j=0;j<20;j++) {
            executorService.submit(() -> {
                System.out.println("Again Doing Through executer");
            });
        }

    }
}
