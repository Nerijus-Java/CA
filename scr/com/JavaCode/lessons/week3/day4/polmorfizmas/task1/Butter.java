package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

public class Butter extends Products {

    private int date;

    public Butter() {
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
