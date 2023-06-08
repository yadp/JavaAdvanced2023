package counter;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        CountThread th1 = new CountThread(counter);
        CountThread th2 = new CountThread(counter);
        CountThread th3 = new CountThread(counter);


        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.execute(th1);
        pool.execute(th2);
        pool.execute(th3);

        pool.shutdown();

        /*th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
