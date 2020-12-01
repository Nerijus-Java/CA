package com.JavaCode.lessons.week1.Random.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Try to guess the number from 1 to 100");

        int count = 0;

        while(count != 10 ){
            int guessedNumber = sc.nextInt();

            if (randomNumber > guessedNumber){
                System.out.println("Guessed to low " + guessedNumber);
            } else if (randomNumber < guessedNumber){
                System.out.println("Guessed to high " + guessedNumber);
            } else if (randomNumber == guessedNumber){
                System.out.println("You Win");
            }
            ++count;
            System.out.println("Try's used: " + count);
            System.out.println("---------------------");
        }
        System.out.println("Game has ended");
        System.out.println("the number was " + randomNumber);
    }
}
