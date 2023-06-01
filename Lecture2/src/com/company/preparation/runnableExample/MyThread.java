package com.company.preparation.runnableExample;

public class MyThread implements Runnable {
    String thrdName;

    public MyThread(String name){
        this.thrdName= name;
    }

    @Override
    public void run() {
        System.out.println(this.thrdName+ " starting ");
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + this.thrdName + " count is "+ i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.thrdName + " ending ");
    }


}
