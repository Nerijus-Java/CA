package com.JavaCode.lessons.week2.enumTasks.task7;

import com.JavaCode.lessons.week2.enumTasks.Days;
import com.JavaCode.lessons.week2.enumTasks.Months;

public class Task7 {

    public static void main(String[] args) {
        DayCal dayCal = new DayCal(Days.THURSDAY, Months.DEC,03,2020);

        System.out.println();
        System.out.println("___________________________");
        System.out.println(dayCal.getInfo());
        System.out.println("___________________________");
        System.out.println(dayCal.getDay());
        System.out.println("___________________________");
        System.out.println(dayCal.getMonth());
    }
}
