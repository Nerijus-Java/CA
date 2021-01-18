package com.JavaCode.lessons.week1.Strings.task9;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(getCount(text));

    }

    public static int getCount(String text){
        char[] balas = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            for(char a : balas){
                if (a == text.charAt(i)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
