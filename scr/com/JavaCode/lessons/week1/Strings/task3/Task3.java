package com.JavaCode.lessons.week1.Strings.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        String a = sc.nextLine();

        System.out.println("Enter: ");
        String bigA = sc.nextLine().toUpperCase();

        System.out.println("Is equal");
        if (a.equals(bigA)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println();

        System.out.println("Is equal (IgnoreCaps)");
        if (a.equalsIgnoreCase(bigA)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println();

        String word = "Java";
        System.out.println(word.indexOf("J"));
    }
}
