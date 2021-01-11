package com.JavaCode.nd.nd1_methods_and_more.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scInt();
        }

        System.out.print("Sum of numbers :" + (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]));
        System.out.println();
    }

    public static int scInt (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        System.out.println();
        return num;
    }
}
