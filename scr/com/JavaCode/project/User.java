package com.JavaCode.project;

public class User {
    private String name;
    private int balance = 0;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }
}
