package org.example;


import org.apache.log4j.Logger;

public class Main {
    static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("Info");
        logger.debug("Debug");
    }
}