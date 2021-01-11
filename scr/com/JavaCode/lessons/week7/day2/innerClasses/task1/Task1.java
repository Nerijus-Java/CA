package com.JavaCode.lessons.week7.day2.innerClasses.task1;

public class Task1 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.Inner innerClass = outerClass.new Inner();

        innerClass.test();
    }
}




