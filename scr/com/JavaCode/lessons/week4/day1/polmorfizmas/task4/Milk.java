package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

public class Milk implements Product {
    private int date;
    private int calories;

    public Milk() {
        this.date = getRandom();
        this.calories = getRandomCal();
    }

    public boolean isSafeToConsume() {
        if (this.date >= 2) {
            return false;
        } else {
            return true;
        }
    }

    public int caloriesAmount() {
        return calories;
    }
}
