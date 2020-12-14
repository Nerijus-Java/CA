package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

import java.util.Random;

interface Product {

    boolean isSafeToConsume();
    int caloriesAmount();

    default int getRandom() {
        Random random = new Random();
        return random.nextInt(5);
    }

    default int getRandomCal() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
