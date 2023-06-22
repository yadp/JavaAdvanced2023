package org.example;


import org.apache.log4j.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");

        System.out.println("Hello world!");
    }
}