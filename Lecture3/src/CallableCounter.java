import java.util.concurrent.Callable;

public class CallableCounter implements Callable {
    @Override
    public Object call() throws Exception {
        int i=0;
        for (; i < 100; i++) {
            System.out.println("Increment " + i);
        }
        return i;
    }
}
