package com.JavaCode.lessons.week6.day2.exeptions.task1;

public class Task1 {

    public static void main(String[] args) {
        String text = "hello";
        printUpper(text);

        String textTwo = null;
        printUpper(textTwo);
    }

    public static void printUpper(String text) {
        if (text == null) {
            throw new NullPointerException("Text can't be null");
        } else {
            System.out.println(text.toUpperCase());
        }
    }
}
