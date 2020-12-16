package com.JavaCode.lessons.week4.day2.dateTask;

import java.util.Calendar;

public class DateTask2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2002);
        calendar.set(Calendar.MONTH, 4);
        calendar.set(Calendar.DATE, 4);

        System.out.println(calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
    }
}
