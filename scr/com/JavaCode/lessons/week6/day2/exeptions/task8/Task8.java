package com.JavaCode.lessons.week6.day2.exeptions.task8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String userInput = "";

        while (!userInput.equals("-")){
            System.out.println("Enter the date with this format dd-M-yyyy");
            try {
                Date date = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
