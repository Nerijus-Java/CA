package com.JavaCode.lessons.week4.day2.polmorfizmas.taskSkaiciai;

public class TrueNumber extends AbstractNumber implements Number {
    int [] array = intArrayGen();

    @Override
    public int[] generate() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
