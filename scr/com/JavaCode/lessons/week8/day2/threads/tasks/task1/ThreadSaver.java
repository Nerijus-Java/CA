package com.JavaCode.lessons.week8.day2.threads.tasks.task1;

public class ThreadSaver extends Thread {

    private String name;
    private FileWriter fileWriter;
    private Counter counter;
    private int lastValue = 0;

    public ThreadSaver(String name, FileWriter fileWriter, Counter counter) {
        this.name = name;
        this.fileWriter = fileWriter;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getLastValue() != -1) {
            if (counter.getValue() != lastValue || counter.getValue() == 0) {
                threadSleep();
                writeFile();
                lastValue = counter.getValue();
            }
            threadSleep();
        }
        System.out.println("Ended " + name);
    }

    private void writeFile() {
        fileWriter.write(counter.getValue());
        threadSleep();
    }

    private void threadSleep() {
        try {
            sleep(50l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
