package com.JavaCode.lessons.week8.day1.threads.example;

public class MyThreadClass extends Thread{

    private String threadName;

    public MyThreadClass(String s) {
        this.threadName = s;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int count = 1, row = 1; row < 50; row++, count++){
            for (int i = 0; i < count; i ++){
                System.out.print("*");
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
