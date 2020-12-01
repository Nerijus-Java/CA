package com.JavaCode.lessons.week1.Strings.task8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int x = 0;

        String text2 = text.trim();

        for (int i = 0; i < text2.length(); i++){
            if (text2.charAt(i) == ' '){
                ++x;
            }
        }
        System.out.println(x);
    }
}
