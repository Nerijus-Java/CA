package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;


public class Bread extends Product {

    private int date;

    public Bread() {
        this.date = getRandom();
    }

    public boolean isSafeToConsume() {
        if (this.date >= 3) {
            return false;
        } else {
            return true;
        }
    }
}
