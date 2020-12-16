package com.JavaCode.lessons.week4.day2.dateTask;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class DateTask2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2002);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DAY_OF_MONTH, 4);

        SimpleDateFormat fmt;
        fmt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Birthday: " + fmt.format(calendar.getTime()));
    }
}
