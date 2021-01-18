package com.JavaCode.lessons.week4.day3.date.task5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month/Day/Year");
        LocalDate localDate = LocalDate.parse(sc.nextLine(), dTF);
        System.out.println(localDate);

    }
}
