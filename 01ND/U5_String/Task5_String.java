package com.JavaCode.Nd.Nd1_methods_and_more.U5_String;

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
