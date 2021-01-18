package com.JavaCode.lessons.week3.day4.abstractClasses.task6_7;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override
    public String toString() {
        return getColor() + '\n' + "Area :" +getArea();
    }


}
