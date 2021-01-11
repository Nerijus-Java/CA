package com.JavaCode.lessons.week7.day2.innerClasses.task3;

public class Task3 {

    public static void main(String[] args) {
        OuterAndInner outerAndInner = new OuterAndInner();
        OuterAndInner.Inner inner = new OuterAndInner.Inner();

        inner.test();
    }
}
