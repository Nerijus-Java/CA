package com.JavaCode.lessons.week3.day1.oeratores.task3;

import com.JavaCode.lessons.week3.day1.oeratores.task3a.Task3a;

public class task3 {

    public static void main(String[] args) {
        System.out.println(hello());
        Task3a hello = new Task3a();
        System.out.println(hello());
    }

    protected static String hello (){
        return "hello world";
    }
}
