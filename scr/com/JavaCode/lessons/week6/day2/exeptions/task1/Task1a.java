package com.JavaCode.lessons.week6.day2.exeptions.task1;

public class Task1a {

    public static void main(String[] args) {
        String text = null;
        printToUppercase(text);
    }

    public static void printToUppercase(String text){
        try {
            System.out.println(text.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("Text can't be null");
        }
    }
}
