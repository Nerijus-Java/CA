package com.JavaCode.lessons.week3.day2.inheritance.task1;

public class Second extends First{

    private String word;

    public Second() {
        System.out.println("Second");
    }

    public Second(String word){
        this.word = word;
        System.out.println("Second " + word);
    }
}
