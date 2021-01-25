package com.JavaCode.ND.nd06.accessModifiers.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PVM code :");
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();


        int count = 0;
        for (char c : charArray){


            count++;
        }
    }
}
