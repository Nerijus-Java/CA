package com.JavaCode.lessons.week4.day2.dateTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTask {

    public static void main(String[] args) {
        Date now;
        SimpleDateFormat fmt;

        now = new Date();
        fmt = new SimpleDateFormat("dd MMM yyyy");
        System.out.println("Date: " + fmt.format(now));


    }
}
