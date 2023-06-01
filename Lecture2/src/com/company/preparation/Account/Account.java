package com.company.preparation.Account;

public class Account {

    private String name;
    private double money;

    public Account(String name, double money){
        this.name= name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double credit(double amount){
        money += amount;
        return money;
    }

    public double debit(double amount) throws Exception {
        if (money < amount){
            throw new Exception("Not enough money. You want to transfer "
                    + amount
                    + " And there is only "
            + money + " left");
        } else {
            money= money-amount;
            return money;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
