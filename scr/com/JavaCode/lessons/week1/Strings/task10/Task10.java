package com.JavaCode.lessons.week1.Strings.task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");

        String text = sc.nextLine();
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(0));
        System.out.println("Does text contain i : " + doesHaveALetter('i',text));


    }

    public static boolean doesHaveALetter(char letter, String text){
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }
}
