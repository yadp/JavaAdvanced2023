package sum;


public class Sync {

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        MyThread mt1 = MyThread.createAndStart("Chile #1", a);
        MyThread mt2 = MyThread.createAndStart("Chile #2", a);
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc){
            System.out.println("FibbonacciExample.Main thread end");
        }
    }
}
