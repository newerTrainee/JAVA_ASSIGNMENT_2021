import java.util.*;
import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private String value;
    @Override
    public String call() throws Exception {

        return value+"Task Completed";
    }

    CallableTask(String value){
        this.value = value;
    }
}

class CallableTask1 implements Callable<String>{
    private String value;

    @Override
    public String call() throws Exception {

        return value+"Task 1 is complete";
    }

    CallableTask1(String value){
        System.out.println("Task1 is initiated");
        this.value = value;
    }
}
public class ListOfTaskEx {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask_> list = new ArrayList<>();
        list.add(new CallableTask_("Hello Sumit"));
        list.add(new CallableTask_("hello Raj"));
        list.add(new CallableTask_("Hello Divas"));
      List<Future<String>> tasks = executorService.invokeAll(list);
        for (Future<String> result: tasks)
             {
                 System.out.println(result.get());
        }
         executorService.shutdown();
    }
}
