package com.JavaCode.ND.nd05.arrayTasks;

public class Task9 {

    //9. Write a Java program to insert an element (specific position) into an array.

    public static void main(String[] args) {
        int[] arrayOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] arrayTwo = addElement(arrayOne,2,22);
        printArray(arrayTwo);
    }

    public static int[] addElement(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];
        int count = 0;
        for (int i : array) {
            if (count == index - 1) {
                newArray[count] = element;
                count++;
            }
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
