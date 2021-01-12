package com.JavaCode.lessons.week8.day1.threads.example;

public class ExampleOne {

    public static void main(String[] args) {
        MyThreadClass mt = new MyThreadClass("Thread-1");
        mt.run();

        for (int i = 0; i < 500; i++) {
            System.out.println("i = " + i + ", i * i = " + i * i);
        }

    }
}