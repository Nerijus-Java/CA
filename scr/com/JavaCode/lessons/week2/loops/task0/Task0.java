package com.JavaCode.lessons.week2.loops.task0;

import java.util.Random;
import java.util.Scanner;

public class Task0 {

    public static void main(String[] args) {
        String input = "";

        loopWhile(input);


    }

    public static void menuOne(){
        System.out.println("______________________________________");
        System.out.println("[1] generate a number from 1-100");
        System.out.println("[2] generate 10 random numbers");
        System.out.println("[-] Exit");
        System.out.println("______________________________________");
    }

    private static int generateRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max + 1);
    }

    public static int[] randomNumber(int max, int times){
        int[] array = new int[times];
        for (int i = 0; i < times; i++) {
            array[i] = generateRandomNumber(100);
        }
        return array;
    }


    public static void loopWhile(String input){
        Scanner sc = new Scanner(System.in);
        while(!input.equals("-")){
            menuOne();
            input = sc.nextLine();

            switch (input){
                case "1":
                    System.out.println("______________________________________");
                    System.out.println("Number generate is " + generateRandomNumber(100));
                    break;
                case "2":
                    System.out.println("______________________________________");
                    for (int i : randomNumber(100,10)) {
                        System.out.println(i);
                    }
                    break;
                case "-":

                    break;
            }
        }
    }

//    public static void loopDoWhile(String input){
//        Scanner sc = new Scanner(System.in);
//        String inputCopy = input;
//        do {
//            menuOne();
//            inputCopy = sc.nextLine();
//
//        }while (inputCopy.equals("-")){
//
//        }
//    }
//
}
