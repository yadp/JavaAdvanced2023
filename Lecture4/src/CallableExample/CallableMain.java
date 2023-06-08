package CallableExample;
import java.util.Objects;
import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) {
       /* Callable<Objects> callable = new CallableCounter();
        FutureTask<Objects> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            while (!futureTask.isDone()){
                System.out.println("Future task is not done");
                Thread.sleep(10);
            }
            System.out.println("Future: " + futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Objects> callable1 = new CallableCounter("Callable1");
        Callable<Objects> callable2 = new CallableCounter("Callable2");
        Callable<Objects> callable3 = new CallableCounter("Callable3");
        Future<Objects> future1 = executorService.submit(callable1);
        Future<Objects> future2 = executorService.submit(callable2);
        Future<Objects> future3 = executorService.submit(callable3);

        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
