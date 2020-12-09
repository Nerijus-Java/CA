package com.JavaCode.nd.nd2_Advance.task12;

import java.util.Random;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int input = sc.nextInt();

        printNByBMatrix(input);
    }

    public static void printNByBMatrix(int number){
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < number; i++) {
            int randomNumber = random.nextInt(2) ;
            System.out.print((randomNumber) + " ");
            count++;
            if (count % 20 == 0){
                System.out.println();
            }
        }
    }
}
