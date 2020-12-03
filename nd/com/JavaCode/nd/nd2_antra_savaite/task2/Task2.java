package com.JavaCode.nd.nd2_antra_savaite.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Bread", "Cheese", "Yogurt", "ketchup", "butter"};

        System.out.println("Enter a vegetable");
        String userInput = sc.nextLine();
        System.out.println(randomProductAndVeg(products, userInput));
    }

    public static String randomProductAndVeg(String[] product, String userInput){
        Random random = new Random();
        return userInput +" is good with " +product[random.nextInt(4)];
    }
}
