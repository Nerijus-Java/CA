package com.JavaCode.lessons.week3.day1.strings.task1;


public class Task1 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int amount = 60;
        for (int i = 1; i < amount; i++) {
            if (i != amount - 1){
                stringBuilder.append(i + ",");
            }else {
                stringBuilder.append(i + " ");
            }

        }
        System.out.println(stringBuilder);
    }

}
