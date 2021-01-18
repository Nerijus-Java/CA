package com.JavaCode.lessons.week4.day3.date.task3And4;

import java.util.Date;

public class Task3 {

    public static void main(String[] args) {

        Date now = new Date();
        Date newDate = new Date(24*60*60*1000);

        witchDateIsBigger(now,newDate);

        Date newDateTwo = addYear(now);
        System.out.println(now.getYear());
        System.out.println(newDateTwo.getYear());

    }

    public static void witchDateIsBigger(Date dateOne,Date dateTwo){
        if (dateOne.getTime() > dateTwo.getTime()){
            System.out.println("DateOne is bigger");
        }else {
            System.out.println("DateTwo is bigger");
        }
    }

    public static Date addYear(Date date){
        int yearNow = date.getYear();
        date.setYear(yearNow + 1);
        return date;
    }
}
