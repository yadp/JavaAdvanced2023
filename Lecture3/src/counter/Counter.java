package counter;

class Counter extends Thread {

    // Counter Variable
    volatile int count = 0;

    // method which would be called upon
    // the start of execution of a thread
    public void run()
    {
        int max = 1000000;

        // incrementing counter
        // total of max times
        for (int i = 0; i < max; i++) {
            count = count + 1;
        }
    }
}

