package com.JavaCode.lessons.week1.Operators.task0;

import java.util.Random;
import java.util.Scanner;

public class Task0 {

    private static String text;

    public static void main(String[] args) {
        input();
        toUppercase();
        print();
    }

     public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        text = sc.nextLine();
    }

    public static void toUppercase(){
        text.toUpperCase();
    }

    public static void print(){
        System.out.println(text);
        Random random = new Random();
    }
}
