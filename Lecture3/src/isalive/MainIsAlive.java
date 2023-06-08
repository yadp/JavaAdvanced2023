package isalive;

import runnable.ImplementRunnable;

public class MainIsAlive {

    public static void main(String[] args) {
        ImplementRunnable mt1 = new ImplementRunnable();
        Thread th= new Thread(mt1);
        do{
            System.out.println(".");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }while (th.isAlive());
    }
}
