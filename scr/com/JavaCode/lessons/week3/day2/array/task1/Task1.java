package com.JavaCode.lessons.week3.day2.array.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weekDay = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        System.out.println("Enter week number");

        int input = sc.nextInt() - 1;
        System.out.println(weekDay[input]);
    }
}
