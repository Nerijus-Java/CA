package com.JavaCode.ND.nd06.exceptionExer.task2;

import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class Task2 {

    public static void main(String[] args) {
        try {
            throw new MyExceptionForHW06("Text is null");
        }catch (MyExceptionForHW06 e){
            System.err.println("Error: " + e.getMessage());
        }finally {
            System.out.println("I am here");
        }

    }

}
