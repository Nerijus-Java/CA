package com.JavaCode.nd.nd2.nd2_Advance.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter :");
            numbers[i] = sc.nextInt();
        }
        System.out.println("The average is " + (numbers[0] + numbers[1] + numbers[2]) / 3);
    }
}
