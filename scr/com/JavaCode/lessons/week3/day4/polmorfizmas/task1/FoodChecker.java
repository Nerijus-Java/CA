package com.JavaCode.lessons.week3.day4.polmorfizmas.task1;

public class FoodChecker {

    public String isFoodSafe(Products product) {
        if (product.isSafeToConsume()){
            return "Safe";
        }else {
            return "Not safe";
        }
    }


}
