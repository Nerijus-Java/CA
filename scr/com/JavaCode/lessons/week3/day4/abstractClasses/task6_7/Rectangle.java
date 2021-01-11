package com.JavaCode.lessons.week3.day4.abstractClasses.task6_7;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return getColor() + '\n' + length + " X " + width + " = " + getArea() + '\n';
    }
}
