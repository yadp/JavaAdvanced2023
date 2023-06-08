package sumArray;

public class MultiThread extends Thread{

    private int[] arr;

    public MultiThread(int[] arr) {
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
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            multi*=arr[i];
        }
        System.out.println("Multi is "+ multi);
    }
}
