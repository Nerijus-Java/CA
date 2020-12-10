package com.JavaCode.lessons.week3.day4.abstractClasses.task6_7;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return getColor() + '\n' + base + " X " + height + " = " + getArea() + '\n';
    }
}
