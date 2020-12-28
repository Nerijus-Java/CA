package com.JavaCode.ND.nd05;

public class Task8 {

    //8. Write a Java program to copy an array by iterating the array.

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,7};

        int[] newArray = copyArray(array);
        printArray(newArray);
    }

    public static int[] copyArray(int[] array){
        int [] newArray = new int[array.length];
        int count = 0;
        for (int i : array){
            newArray[count] = i;
            count++;
        }

        return newArray;
    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}
