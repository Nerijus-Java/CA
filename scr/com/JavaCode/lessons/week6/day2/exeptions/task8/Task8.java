package com.JavaCode.lessons.week6.day2.exeptions.task8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String userInput = "";

        for (; ; ) {
            System.out.println("Enter the date with this format: dd-MM-yyyy hh:mm:ss");
            Date date = null;
            userInput = sc.nextLine();

            try {
                date = sdf.parse(userInput);
            } catch (ParseException | NullPointerException e) {
                System.out.println("try Again");
                System.out.println();
            } finally {
                try {
                    System.out.println(sdf.format(date));
                    break;
                } catch (NullPointerException ignored){

                }
            }
        }


    }
}
