package com.JavaCode.lessons.week4.day1.polmorfizmas.task3;

import java.util.Random;

public class EvenNumber extends Number{
    Random random = new Random();

    @Override
    public void generate() {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(180) + 20;
        }
    }
}
