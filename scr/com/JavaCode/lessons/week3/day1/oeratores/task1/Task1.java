package com.JavaCode.lessons.week3.day1.oeratores.task1;

public class Task1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(90, 70);
        rectangle.setA(4);
        rectangle.setB(34);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
