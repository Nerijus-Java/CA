package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

public class Yogurt extends Products {

    private int date;

    public Yogurt() {
        this.date = getRandom();
    }

    public boolean isSafeToConsume() {
        if (this.date >= 2) {
            return false;
        } else {
            return true;
        }
    }
}
