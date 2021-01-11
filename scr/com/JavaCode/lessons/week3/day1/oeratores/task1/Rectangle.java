package com.JavaCode.lessons.week3.day1.oeratores.task1;

public class Rectangle {
    private int a;
    private int b;

    protected Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected int area() {
        return a * b;
    }

    protected int perimeter() {
        return a + b + a + b;
    }

    protected void setA(int a) {
        this.a = a;
    }

    protected void setB(int b) {
        this.b = b;
    }


}
