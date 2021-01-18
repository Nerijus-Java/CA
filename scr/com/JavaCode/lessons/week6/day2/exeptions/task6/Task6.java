package com.JavaCode.lessons.week6.day2.exeptions.task6;

import com.JavaCode.lessons.week6.day2.exeptions.task2.BestException;

public class Task6 {

    public static void main(String[] args) throws BestException {
        methodOne();
    }

    public static void methodOne() throws BestException {
        try {
            methodTwo();
        } catch (BestException e) {
            throw e;
        } finally {
            System.out.println();
        }
    }

    public static void methodTwo() throws BestException {
        throw new BestException("Task 4 Exception");
    }
}
