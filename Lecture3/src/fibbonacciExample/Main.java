package fibbonacciExample;

public class Main {

    public static void main(String[] args) {
        // write your code here
        fibbonacciExample.Factorial implementRunnable = new fibbonacciExample.Factorial(20);
        Thread thread = new Thread(implementRunnable);
        thread.start();

        fibbonacciExample.Fibbonacci implementRunnable1 = new fibbonacciExample.Fibbonacci(20);
        Thread thread1 = new Thread(implementRunnable1);
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TestMessage");


        //ExtendThread.ExtendThread extendThread = new ExtendThread.ExtendThread(10);

    }
}
