package com.JavaCode.lessons.week3.day2.inheritance.task0;

public class Task0 {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.first());

        Child child = new Child();
        System.out.println(child.second());

        Child child1 = new Child();
        System.out.println(child1.first());
    }
}
