package sumArray;

public class SumArrayRunnable implements Runnable{

    private int[] arr;



    public SumArrayRunnable(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Sum is "+ sum);
    }
}
