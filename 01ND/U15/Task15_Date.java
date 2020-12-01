package com.JavaCode.Nd.Nd1_methods_and_more.U15;

import java.util.Scanner;

public class Task15_Date {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        float minutes = sc.nextInt();

        float hours = minutesToHours(minutes);
        float days = hoursToDays(hours);
        float years = daysToYears(days);

        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
        System.out.println("Years: " + years);

    }

    public static float minutesToHours(float minutes){
        return minutes / 60;
    }

    public static float hoursToDays(float hours){
        return hours / 24;
    }

    public static float daysToYears(float days){
        return days / 365;
    }
}
