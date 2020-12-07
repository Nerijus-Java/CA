package com.JavaCode.lessons.week3.day1.strings.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        System.out.println(wasBornIn(sentence));
    }

    public static String wasBornIn(StringBuilder stringBuilder) {
        stringBuilder.append("User ");
        getNameSB(stringBuilder);
        stringBuilder.append(" was born in ");
        getYearSB(stringBuilder);

        return (stringBuilder.toString());
    }

    private static void getNameSB(StringBuilder stringBuilder){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        stringBuilder.append(sc.nextLine().trim());
    }

    private static void getYearSB(StringBuilder stringBuilder){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year you was born in");
        stringBuilder.append(sc.nextLine().trim());
    }
}
