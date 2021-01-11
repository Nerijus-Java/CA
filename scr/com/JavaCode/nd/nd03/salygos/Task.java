package com.JavaCode.nd.nd03.salygos;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number > 0) {
            if (number < 13) {
                printMonth(number);
            }else {
                System.out.println("Number is wrong");
            }
        } else {
            System.out.println("Number is wrong");
        }

    }

    public static void printMonth(int number) {
        if (number % 2 == 0) {
            switch (number) {
                case 2:
                    System.out.println("February");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 12:
                    System.out.println("December");
            }
        } else {
            switch (number) {
                case 1:
                    System.out.println("January");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 11:
                    System.out.println("November");
            }

        }
    }

}
