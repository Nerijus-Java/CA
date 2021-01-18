package com.JavaCode.ND.nd05.arrayTasks;

public class Task7 {

    //7. Write a Java program to remove a specific element from an array.

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        printArray(array);

        int [] newArray = removeElementFromArray(array,2);
        printArray(newArray);
    }

    public static int[] removeElementFromArray(int[] array, int element){
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i : array){
            if (i != element){
                newArray[count] = i;
                count++;
            }
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
