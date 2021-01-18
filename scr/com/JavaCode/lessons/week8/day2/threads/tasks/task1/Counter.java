package com.JavaCode.lessons.week8.day2.threads.tasks.task1;

public class Counter {

    private int value;
    private int lastValue = 0;

    public Counter() {
    }

    public void incrementValue(int value) {
        this.value = this.getValue() + value;
    }

    public int getValue() {
        return value;
    }

    public int getLastValue() {
        return lastValue;
    }

    public void setLastValue(int lastValue) {
        this.lastValue = lastValue;
    }
}
