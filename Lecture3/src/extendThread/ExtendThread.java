package extendThread;

public class ExtendThread extends Thread{

    public static final int DEFAULT_COUNT=1000;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount( int count){
        this.count= count;
    }

    public ExtendThread(){
        this.count=DEFAULT_COUNT;
    }
    public  ExtendThread(int count){
        this.count=count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
    }
}
