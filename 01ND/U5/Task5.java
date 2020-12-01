package com.JavaCode.Nd.Nd1_methods_and_more.U5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        System.out.print("Enter number of the month: ");
        int userInput = sc.nextInt();

        if (userInput <= 12 && userInput >= 1){
            System.out.println("Month: " + months[userInput-1]);
        } else {
            System.out.println("No such month");
        }

    }
}
