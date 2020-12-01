package com.JavaCode.lessons.week1.Methods.task7;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers = setOneMeaning(numbers,101,2);
        System.out.println(Arrays.toString(numbers));

        setAllMeaning(numbers, 101);
        System.out.println(Arrays.toString(numbers));

    }
    public static int[] setOneMeaning(int[] a, int meaning ,int number){
        a[number] = meaning;
        return a;
    }
    public static void setAllMeaning(int[] a , int meaning){
        for (int i = 0; i < a.length; i++) {
            a[i] = meaning;
        }
    }

}
