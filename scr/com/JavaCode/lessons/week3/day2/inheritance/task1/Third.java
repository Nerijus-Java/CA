package com.JavaCode.lessons.week3.day2.inheritance.task1;

public class Third extends Second{


    public Third() {
        System.out.println("Third");
    }

    public Third(String word){
        super();
        System.out.println("Third " + word);
    }
}
