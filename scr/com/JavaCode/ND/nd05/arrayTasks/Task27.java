package com.JavaCode.ND.nd05.arrayTasks;

public class Task27 {

    //27. Write a Java program to find the number of even and odd integers in a given array of integers.

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(printEvenAndOddNumbers(ints));
    }

    public static String printEvenAndOddNumbers(int[] array) {
        String even = " ";
        String odd = " ";
        for (int i : array) {
            if (i % 2 == 0) {
                even += i + " ";
            } else {
                odd += i + " ";
            }
        }
        return "Even :" + even + '\n' + "Odd  :" + odd;
    }
}
