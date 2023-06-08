package counter;

public class CountThread extends java.lang.Thread {

    private Counter counter;

    public CountThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            synchronized (counter) {
                counter.addCount();
            }

        }
    }
}
