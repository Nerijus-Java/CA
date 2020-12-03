package com.JavaCode.lessons.week2.classes.staticTasks;

public class Task4 {

    public static void main(String[] args) {
        NonStatic a = new NonStatic();
        a.setNumber(2);
        System.out.println(a.getNumber());

        Static b = new Static();
        b.setNumber(5);
        System.out.println(b.getNumber());
    }
}
