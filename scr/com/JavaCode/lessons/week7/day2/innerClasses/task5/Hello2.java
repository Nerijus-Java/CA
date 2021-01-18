package com.JavaCode.lessons.week7.day2.innerClasses.task5;

public class Hello2 {

    private int number = 10;
    private String word = "Hello";

    public IDay goodMorning(){
        class ABC implements IDay{

            @Override
            public void print() {
                System.out.println("GoodMorning " + number + " " + word);
            }
        }
        IDay obj = new ABC();
        return obj;
    }
}
