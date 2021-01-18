package com.JavaCode.lessons.week6.day2.exeptions.task6a;

import com.JavaCode.lessons.week6.day2.exeptions.task2.BestException;

public class Task6a {

    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        try {
            first.method();
        } catch (BestException e) {
            e.printStackTrace();
        }

        second.method();
    }
}
