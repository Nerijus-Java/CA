package com.JavaCode.lessons.week1.Random.task3;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < 100000; i++) {
            int randomNumber = random.nextInt(100);
            numbers[randomNumber]++;
        }

        int numberProcessed = 0;
        int count = 1;

        for (int i : numbers){
            System.out.print(count + ": ");
            System.out.println(i);
            ++count;
            numberProcessed += i;
        }
        System.out.println("Number Processed: "+numberProcessed);
    }
}
