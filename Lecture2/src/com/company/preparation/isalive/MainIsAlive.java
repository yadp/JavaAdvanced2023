package com.company.preparation.isalive;

import com.company.preparation.runnableExample.MyThread;

public class MainIsAlive {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread("mt1");
        Thread th= new Thread(mt1);
        do{
            System.out.println(".");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }while (th.isAlive());
    }
}
