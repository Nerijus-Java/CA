package com.JavaCode.ND.nd06.exceptionExer.task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ;
        for (;;){

            System.out.println("Enter a number");
            String input = sc.nextLine();

            try {
                i = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Try again");
            }

        }
    }
}
