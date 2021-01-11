package com.JavaCode.lessons.week3.day3.inherance.task2;

public class Automobile {
    private String make;
    private String number;

    public Automobile(String make, String number) {
        this.make = make;
        this.number = number;
    }

    @Override
    public String toString() {
        return "make :" + make + '\n' +
                "Number :" + number + '\n' +
                "__________________________" + '\n';
    }
}
