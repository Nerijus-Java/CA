package com.JavaCode.lessons.week2.classes.staticTasks;

public class Task4 {

    public static void main(String[] args) {
        NonStatic a = new NonStatic(2);
        a.setNumber(2);
        System.out.println(a.getNumber());

        Static b = new Static();

        Static c = new Static();
        b.setNumber(5);
        Static d = new Static();
        b.resetNumber();
        Static e = new Static();
        b.setNumber(44);
        Static f = new Static();
        d.setNumber(3);

    }
}
