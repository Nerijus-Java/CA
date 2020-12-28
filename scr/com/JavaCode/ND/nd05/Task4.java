package com.JavaCode.ND.nd05;

public class Task4 {

    //4. Write a Java program to calculate the average value of array elements.

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 5, 6, 7, 8};
        System.out.println(arrayAverageValue(array));

    }

    public static int arrayAverageValue(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum / array.length;
    }
}
