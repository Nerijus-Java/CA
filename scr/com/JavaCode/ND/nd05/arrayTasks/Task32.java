package com.JavaCode.ND.nd05.arrayTasks;

public class Task32 {

    //32. Write a Java program to check if an array of integers contains two specified elements 65and 77.

    public static void main(String[] args) {
        int[] ints1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] ints2 = new int[]{1,2,65,4,5,6,77,8,9};

        System.out.println(doesContain65or77(ints1));
        System.out.println(doesContain65or77(ints2));
    }

    public static boolean doesContain65or77 (int[] array){
        for (int i : array){
            if (i == 65 || i == 77){
                return true;
            }
        }
        return false;
    }
}
