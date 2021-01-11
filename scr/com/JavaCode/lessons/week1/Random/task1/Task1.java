package com.JavaCode.lessons.week1.Random.task1;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;
        int c = random.nextInt(100) + 1;

        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(a); numbersArray.add(b); numbersArray.add(c);

        System.out.println(numbersArray);
        System.out.println("Max: " + getBiggestNumber(numbersArray));
    }

    public static int getBiggestNumber(ArrayList<Integer> num){
        int max = 0;
        for (int i : num){
            if (i >= max){
                max = i;
            }
        }
        return max;
    }
}
