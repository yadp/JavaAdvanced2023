package callableFutureTest;

// Java program to illustrate Callable and FutureTask
// for random number generation
import java.util.Random;
import java.util.concurrent.*;

class CallableExample implements Callable
{

    public Object call() throws Exception
    {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);

        Thread.sleep(randomNumber * 1000);

        return randomNumber;
    }

}

public class CallableFutureTest
{
    public static void main(String[] args) throws Exception
    {

        // FutureTask is a concrete class that
        // implements both Runnable and Future
        FutureTask[] randomNumberTasks = new FutureTask[5];


        /*
        Create a counter with callable. The Counter should take a number N.
        And then counts from 1 to N.
        Show how the final number can be accessed from Main.

         */
        for (int i = 0; i < 5; i++)
        {
            Callable callable = new CallableExample();

            // Create the FutureTask with Callable
            randomNumberTasks[i] = new FutureTask(callable);

            // As it implements Runnable, create Thread
            // with FutureTask
            Thread t = new Thread(randomNumberTasks[i]);
            t.start();

            ExecutorService pool = Executors.newFixedThreadPool(3);
            Future<Object> test = pool.submit(callable);
            test.get();
        }

        for (int i = 0; i < 5; i++)
        {
            // As it implements Future, we can call get()
            System.out.println(randomNumberTasks[i].get());

            // This method blocks till the result is obtained
            // The get method can throw checked exceptions
            // like when it is interrupted. This is the reason
            // for adding the throws clause to main
        }
    }
}

