package com.JavaCode.nd.nd2_antra_savaite.task3;

import java.util.Scanner;


public class Task3 {

    public static final int ARRAY_AMOUNT = 5;
    public static final int LOOP_AMOUNT = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[ARRAY_AMOUNT];

        int userInput;
        for (int i = 0; i < LOOP_AMOUNT; i++) {
            System.out.print("Enter:");
            userInput = sc.nextInt();
            intArray[userInput - 1] += 1;
        }
        int count = 1;
        System.out.println("________");
        for(int i : intArray){
            System.out.println(count + ": " + i);
            count++;
        }
    }

}
