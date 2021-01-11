package com.JavaCode.lessons.week4.day2.polmorfizmas.taskSkaiciai;

import java.util.Random;

public class EvenNumber extends AbstractNumber implements Number {
    int[] array = intArrayGen();

    @Override
    public int[] generate() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int oldI = i;
            int number = random.nextInt(180) + 20;
            if (number % 2 != 0 || number == 0) {
                i = oldI;
            } else {
                array[i] = number;
            }
        }
        return array;
    }
}
