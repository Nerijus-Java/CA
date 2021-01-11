package com.JavaCode.lessons.week7.day2.innerClasses.task6;

import com.JavaCode.lessons.week7.day2.innerClasses.task5.IDay;

public class Hello3 {

    private int number = 10;
    private String word = "Hello";

    public IDay goodMorning(){
        IDay obj = () -> System.out.println("GoodMorning " + number + " " + word);
        return obj;
    }

    public IDay goodAfterNoon(){
        IDay obj = () -> System.out.println("GoodAfterNoon " + number + " " + word);
        return obj;
    }

    public IDay someDay(){
        IDay obj = () -> System.out.println("SomeDay " + number + " " + word);
        return obj;
    }
}
