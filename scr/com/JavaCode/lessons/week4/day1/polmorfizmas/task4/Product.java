package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

import java.util.Random;

interface Product {

    boolean isSafeToConsume();

    default int getRandom() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
