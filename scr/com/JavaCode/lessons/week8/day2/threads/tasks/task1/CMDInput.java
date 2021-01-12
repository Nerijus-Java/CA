package com.JavaCode.lessons.week8.day2.threads.tasks.task1;

import java.util.Scanner;

public class CMDInput {

    private Scanner sc = new Scanner(System.in);
    private ThreadSaver threadSaver;
    private Counter counter;

    public CMDInput(ThreadSaver threadSaver, Counter counter) {
        this.threadSaver = threadSaver;
        this.counter = counter;
    }

    public void start() {
        threadSaver.start();
        while (counter.getLastValue() != -1) {
            System.out.print("Value :");
            int input = sc.nextInt();
            counter.incrementValue(input);
            counter.setLastValue(input);
        }
    }

}
