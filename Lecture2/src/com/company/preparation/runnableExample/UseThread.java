package com.company.preparation.runnableExample;

public class UseThread {

    public static void main(String[] args) {
        MyThread mt = new MyThread("Child 1");

        //wrong way
       /* mt.run();
        System.out.println("Test");*/

        Thread thread = new Thread(mt);
        thread.start();

        //thread.setPriority(10);


        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
