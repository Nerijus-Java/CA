package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

public class Task4 {

    public static void main(String[] args) {
        ProductHelper productHelper = new ProductHelper();

        Product milk = new Milk();
        Product butter = new Butter();
        Product bread = new Bread();
        Product cheese = new Cheese();
        Product yogurt = new Yogurt();

        System.out.println(productHelper.isFoodSafe(milk));
        System.out.println(productHelper.isFoodSafe(butter));
        System.out.println(productHelper.isFoodSafe(bread));
        System.out.println(productHelper.isFoodSafe(cheese));
        System.out.println(productHelper.isFoodSafe(yogurt));

        System.out.println();

        System.out.println(productHelper.CalorieAmount(milk));
        System.out.println(productHelper.CalorieAmount(butter));
        System.out.println(productHelper.CalorieAmount(bread));
        System.out.println(productHelper.CalorieAmount(cheese));
        System.out.println(productHelper.CalorieAmount(yogurt));
    }
}
