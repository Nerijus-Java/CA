package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

public class Milk extends Products {
    private int date;

    public Milk() {
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
