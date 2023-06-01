package com.company.preparation.Account;

public class MainAccount {
    public static void main(String[] args) {
        Object object = new Object();


        Account ben = new Account("Ben", 100);
        Account tom = new Account("Tom", 100);

        try {
            tom.debit(60);
            ben.credit(60);
        } catch (Exception e) {
            System.out.println("Not possible");
            System.out.println("After the failed transaction balance is");
            System.out.println(ben);
            System.out.println(tom);
        }

        System.out.println(ben);
        System.out.println(tom);

        try {
            tom.debit(50);
            ben.credit(50);
        } catch (Exception e) {
            System.out.println("Not possible " + e.getMessage());
            System.out.println("After the failed transaction balance is");
            System.out.println(ben);
            System.out.println(tom);
        }
    }
}
