package com.JavaCode.lessons.week6.day2.exeptions.task2;

public class Task2 {

    public static void main(String[] args) throws BestException {
        String textOne = "Text";
        printToUppercase(textOne);

        printToUppercase(null);
    }

    public static void printToUppercase(String text) throws BestException {
        if (text == null) {
            throw new BestException("Text can't be null");
        } else {
            System.out.println(text.toUpperCase());
        }
    }
}
