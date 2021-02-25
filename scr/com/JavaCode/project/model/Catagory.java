package com.JavaCode.project.model;

public class Catagory {

    private final String name;
    private final boolean income;
    private int amount;
    private final int id;

    public Catagory(String name, boolean income, int amount, int id) {
        this.name = name;
        this.income = income;
        this.amount = amount;
        this.id = id;
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

    public int getId() {
        return id;
    }
}
