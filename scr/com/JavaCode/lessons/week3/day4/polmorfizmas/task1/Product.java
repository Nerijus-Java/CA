package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

import java.util.Random;

public abstract class Product {

    private final int random;

    public Product() {
        Random random = new Random();
        this.random = random.nextInt(5) + 1;
    }

    public abstract boolean isSafeToConsume();

    public int getRandom() {
        return random;
    }
}
