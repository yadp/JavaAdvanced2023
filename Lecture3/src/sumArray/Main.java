package sumArray;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{1,53,23,342};

        SumArrayRunnable sumArray = new SumArrayRunnable(arr);
        Thread sumThread = new Thread(sumArray);
        sumThread.setPriority(1);
        sumThread.start();


        MultiThread multiThread = new MultiThread(arr);
        multiThread.setPriority(10);
        multiThread.start();



    }
}
