package com.JavaCode.ND.nd06.exceptionExer.task1;

import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class Task1 {

    public static void main(String[] args) {

        try {
            throw new MyExceptionForHW06("Null");
        } catch (MyExceptionForHW06 e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here ");
        }
    }
}
