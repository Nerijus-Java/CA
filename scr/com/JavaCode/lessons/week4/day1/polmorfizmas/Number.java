package com.JavaCode.lessons.week4.day1.polmorfizmas;

public abstract class Number {

    protected int[] intArray = intArrayGen();

    public Number() {
        generate();
    }

    private int[] intArrayGen() {
        return new int[10];
    }

    public abstract void generate();

    public int sum() {
        int holder = 0;
        for (int i : intArray) {
            holder += i;
        }
        return holder;
    }

    @Override
    public String toString() {
        return intArray.toString();
    }
}
