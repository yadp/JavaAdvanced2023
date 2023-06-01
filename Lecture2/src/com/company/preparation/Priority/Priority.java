package com.company.preparation.Priority;

public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    public Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }


    @Override
    public void run() {
        System.out.println(thrd.getName() + " Starting");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
          /*  try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/


        } while (stop == false && count < 1000000);
        stop=true;
        System.out.println(thrd.getName() + " Terminating");

    }
}


