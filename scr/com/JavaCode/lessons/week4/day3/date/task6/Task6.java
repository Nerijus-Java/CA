package com.JavaCode.lessons.week4.day3.date.task6;

import java.time.LocalDateTime;

public class Task6 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.toLocalTime());
        System.out.println(localDateTime.plusHours(2).plusMinutes(15).toLocalTime());

    }
}
