package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

public class Task1 {

    public static void main(String[] args) {
        FoodChecker foodChecker = new FoodChecker();

        Milk milk = new Milk();
        Butter butter = new Butter();

        System.out.println(foodChecker.isFoodSafe(milk));
        System.out.println(foodChecker.isFoodSafe(butter));
    }
}
