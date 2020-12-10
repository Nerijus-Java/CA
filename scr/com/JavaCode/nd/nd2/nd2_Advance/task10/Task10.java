package com.JavaCode.nd.nd2.nd2_Advance.task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int userInput = sc.nextInt();

        isLoopYear(userInput);
    }

    public static boolean isLoopYear(int year) {
        if (doesDivideBy(year,4)){
            if (doesDivideBy(year,100)){
                if (doesDivideBy(year,400)){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    private static boolean doesDivideBy(int number, int divideBy) {
        if (number % divideBy == 0) {
            return true;
        } else {
            return false;
        }
    }
}
