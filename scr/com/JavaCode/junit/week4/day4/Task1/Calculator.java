package com.JavaCode.junit.week4.day4.Task1;

public class Calculator {

    private final int a;
    private final int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int times() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }
}
