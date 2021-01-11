package com.JavaCode.lessons.week3.day4.abstractClasses.task6_7;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract int getArea();

    public abstract String toString();

    protected String getColor() {
        return color;
    }

}
