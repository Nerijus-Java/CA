package com.JavaCode.lessons.week8.day2.threads.tasks.task1;

public class Task1 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadSaver threadSaver = new ThreadSaver("Thread One", new FileWriter(), counter);
        CMDInput cmdInput = new CMDInput(threadSaver,counter);

        cmdInput.start();

    }
}
