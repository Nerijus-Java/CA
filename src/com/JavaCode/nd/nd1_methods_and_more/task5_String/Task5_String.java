package com.JavaCode.nd.nd1_methods_and_more.task5_String;

import java.util.Scanner;

public class Task5_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");

        int num = sc.nextInt();

        String text = String.valueOf(num);
        System.out.println(text);
        System.out.println(num + "");
    }
}
