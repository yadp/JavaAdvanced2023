import java.util.Objects;
import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) {
        Callable<Objects> callable = new CallableCounter();
        FutureTask<Objects> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        /*ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Objects> callable = new CallableCounter();

        executorService.submit(callable);*/
    }
}
