package priority;

public class Main {
    public static void main(String[] args) {
        Priority p1 = new Priority("High");
        Priority p2 = new Priority("Low");

        p1.thrd.setPriority(Thread.NORM_PRIORITY + 5);//10
        p2.thrd.setPriority(Thread.NORM_PRIORITY - 2);//3

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        p1.thrd.start();
        p2.thrd.start();
      /*  p3.thrd.start();
        p4.thrd.start();
        p5.thrd.start();*/

        try {
            p1.thrd.join();
            p2.thrd.join();
           /* p3.thrd.join();
            p4.thrd.join();
            p5.thrd.join();*/
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Thread "+ p1.thrd.getName() + " count to "+ p1.count);
        System.out.println("Thread "+ p2.thrd.getName() + " count to "+ p2.count);
      /*  System.out.println("Thread "+ p3.thrd.getName() + " count to "+ p3.count);
        System.out.println("Thread "+ p4.thrd.getName() + " count to "+ p4.count);
        System.out.println("Thread "+ p5.thrd.getName() + " count to "+ p5.count);*/
    }
}
