package com.JavaCode.lessons.week4.day1.polmorfizmas.task4;

public class ProductHelper {

    public String isFoodSafe(Product product) {
        if (product.isSafeToConsume()) {
            return "Safe";
        } else {
            return "Not safe";
        }
    }

    public int CalorieAmount(Product product) {
        return product.caloriesAmount();
    }
}
