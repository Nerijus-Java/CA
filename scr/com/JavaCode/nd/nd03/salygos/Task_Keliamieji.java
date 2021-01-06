package com.JavaCode.nd.nd03.salygos;

import java.util.Scanner;

public class Task_Keliamieji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number % 4 != 0) {
            System.out.println("It is a common year");
        } else if (number % 100 != 0){
            System.out.println("Its a leap year");
        }else if (number % 400 != 0){
            System.out.println("Its a common year");
        }else {
            System.out.println("Its a leap year");
        }
    }
}
