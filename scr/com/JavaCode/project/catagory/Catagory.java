package com.JavaCode.project.catagory;

public class Catagory {

    private String name;
    private boolean income;
    private int amount;

    public Catagory(String name, boolean income, int amount) {
        this.name = name;
        this.income = income;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isIncome() {
        return income;
    }
}
