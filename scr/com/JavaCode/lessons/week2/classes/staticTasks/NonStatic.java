package com.JavaCode.lessons.week2.classes.staticTasks;

public class NonStatic {
    public int number;

    public NonStatic(int number) {
        this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void resetNumber(){
        number = 0;
    }

}
