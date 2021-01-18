package com.JavaCode.lessons.week7.day2.innerClasses.task4;

public class Hello {

    private int number = 10;
    private String word = "Hello";

    public void goodMorning(){

        class MyDay {
            public void day(){
                System.out.println("Day " + number + "," + word);
            }
        }
        MyDay myDay = new MyDay();
        myDay.day();
    }
}
