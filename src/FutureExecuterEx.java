import java.util.concurrent.*;

class CallableTask_ implements Callable<String>{
     private String value;
    @Override
    public String call() throws Exception {

        return value+"Task Completed";
    }

    CallableTask_(String value){
        this.value = value;
    }
}

public class FutureExecuterEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> welcomeFuture = executorService.submit(new CallableTask_("Hello Sumit"));
       //Task 2
        System.out.println("Task 2 is executed");
        System.out.println("Task 2 is Complete");
        System.out.println(welcomeFuture.get());
        System.out.println(welcomeFuture.isDone()); //To check Task is Completed or Not
        System.out.println(welcomeFuture.isCancelled()); //To check Task is cancelled or not
    }
}
