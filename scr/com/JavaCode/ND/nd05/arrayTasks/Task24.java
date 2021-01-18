package com.JavaCode.ND.nd05.arrayTasks;

public class Task24 {


    //24. Write a Java program to find a missing number in an array.

    public static void main(String[] args) {
        int[] ints1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(doesContainNumber(ints1,2));
        System.out.println(doesContainNumber(ints1,10));

    }

    public static boolean doesContainNumber(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
