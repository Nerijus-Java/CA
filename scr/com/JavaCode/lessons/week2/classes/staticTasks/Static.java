package com.JavaCode.lessons.week2.classes.staticTasks;

public class Static {
    public static int Number;

    public Static() {
        System.out.println(Number);
    }

    public void setNumber(int number){
        Number = number;
    }

    public void resetNumber(){
        Number = 0;
    }
}
