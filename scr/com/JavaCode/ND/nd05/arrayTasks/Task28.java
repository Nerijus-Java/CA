package com.JavaCode.ND.nd05.arrayTasks;

public class Task28 {

    //28. Write a Java program to get the difference between the largest and smallest
    // values in an array of integers. The length of the array must be 1 and above.

    public static void main(String[] args) {
        int[] ints1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(difOfMaxAndMinValueInArray(ints1));

    }

    public static int difOfMaxAndMinValueInArray(int[] array){

        int max = 0;
        int min = Integer.MAX_VALUE - 1;

        for (int i : array){
            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
        return max - min;
    }
}
