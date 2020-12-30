package com.JavaCode.ND.nd06.exceptionExer.task5;

import com.JavaCode.ND.nd06.exceptionExer.myExceptions.MyExceptionForHW06;

public class Main {

    public static void main(String[] args) {
        Task5 task5 = new Task5();

        try {
            task5.f();
        } catch (MyExceptionForHW06 e) {
            System.out.println(e.getMessage());
        }
    }
}
