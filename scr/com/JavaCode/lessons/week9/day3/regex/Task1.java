package com.JavaCode.lessons.week9.day3.regex;

public class Task1 {

    public static void main(String[] args) {
        String mailOne = "nerijusV@gmail.com";
        String mailTwo = "gerw@fgw@,kom";

        EmailChecker emailChecker = new EmailChecker();
        if (emailChecker.check(mailOne)){
            System.out.println(mailOne);
        }

        if (emailChecker.check(mailTwo)){
            System.out.println(mailTwo);
        }
    }
}
