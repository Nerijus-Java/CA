package com.JavaCode.nd.nd2.nd2_Advance.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;
        int holder = Integer.MAX_VALUE;

        for (int i = 0 ; i < 10 ; i++){
            System.out.print("Enter: ");
            userInput = sc.nextInt();

            if (userInput < holder){
                holder = userInput;
            }
            System.out.println("Smallest number entered is :" + holder);
        }
    }
}
