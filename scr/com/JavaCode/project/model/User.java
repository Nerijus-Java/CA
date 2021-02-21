package com.JavaCode.project.model;

public class User {
    private final String name;
    private final String password;
    private int balance = 0;

    public User(String name, String password) {
        this.name = name;
        this.password = password;

    }

    public String getName(){
        return this.name;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
