package runnable;

public class MainRunnable {

    public static void main(String[] args)  {
        ImplementRunnable implementRunnable = new ImplementRunnable();
        Thread thread =  new Thread(implementRunnable);
        thread.start();

        try {
            Thread.sleep(100);
            System.out.println("Waitng 100ms before we start thread2");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread thread2 =  new Thread(implementRunnable);
        thread2.start();



        //thread2.start();

    }
}
