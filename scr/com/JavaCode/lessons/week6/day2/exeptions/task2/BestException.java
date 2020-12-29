package com.JavaCode.lessons.week6.day2.exeptions.task2;

public class BestException extends Exception{

    public BestException() {
    }

    public BestException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }

}
