package com.JavaCode.lessons.week4.day2.superTask.carTaskGo;

public class Audi extends Car{

    protected String test(){
        return super.go() + ", " + go();
    }

    protected String go(){
        return "Audi is driving";
    }


}
