package com.JavaCode.ND.nd05;

public class Task6 {

    //6. Write a Java program to find the index of an array element

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(indexOfArray(array,2));
    }

    public static int indexOfArray(int[] array, int index) {
        int count = 0;
        for (int i : array) {
            if (index == count + 1) {
                return i;
            }
            count++;
        }
        return 0;
    }
}
