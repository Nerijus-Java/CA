package com.JavaCode.nd.nd2_Advance.task8;

import java.util.Scanner;

public class Task8 {


    //NoT Done
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Investment amount :");
        float investment = sc.nextFloat();

        System.out.print("Interest rate :");
        float interest = sc.nextFloat();

        System.out.print("Number of years :");
        int years = sc.nextInt();

        for (int i = 0; i < years; i++) {
            System.out.println(1 + amountOfIntrest(investment ,interest/12 ,i));
        }
    }

    public static float amountOfIntrest(float investment, float interest , int years){
        float formulaOne = (1 + interest * (years * 12));
        return investment * formulaOne;
    }
}
