package CallableExample;

import java.util.concurrent.Callable;

public class CallableCounter implements Callable {
    private String name;


    public CallableCounter(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
        int i=0;
        for (; i < 100; i++) {
            System.out.println("Increment  "+ name +  "  "+ i);
        }
        return i;
    }
}
