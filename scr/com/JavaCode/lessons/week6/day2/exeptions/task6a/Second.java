package com.JavaCode.lessons.week6.day2.exeptions.task6a;

public class Second extends First{

    @Override
    public void method() throws NullPointerException {
        throw new NullPointerException("Two");
    }
}
