package com.JavaCode.junit.week4.day4.task3;

public class Wallet {

    private double balance;

    public void addToBalance(double amount) {
        this.balance = balance + amount;
    }

    public void takeAwayFromBalance(double amount) {
        this.balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
