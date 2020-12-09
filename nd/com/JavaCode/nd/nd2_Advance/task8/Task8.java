package com.JavaCode.nd.nd2_Advance.task8;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Investment amount :");
        float investment = sc.nextFloat();

        System.out.print("Interest rate :");
        float interest = sc.nextFloat();

        System.out.print("Number of years :");
        int years = sc.nextInt();

        interest *= 0.01;

        for (int i = 1; i < years; i++) {
            System.out.println(i + amountOfIntrest(i , investment, interest / 12));
        }
    }

    public static double amountOfIntrest(int years, float investment, float interest) {

        return (investment * Math.pow(1 + interest, years * 12));
    }
}
