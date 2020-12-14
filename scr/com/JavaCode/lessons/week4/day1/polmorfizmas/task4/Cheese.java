package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

public class Cheese implements Product {
    private int date;
    private int calories;

    public Cheese() {
        this.date = getRandom();
        this.calories = getRandomCal();
    }

    public boolean isSafeToConsume() {
        if (this.date >= 3) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int caloriesAmount() {
        return calories;
    }
}
