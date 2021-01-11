package com.JavaCode.lessons.week5.day1.collections.task3;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");

        printStringArray(stringArrayList);
    }

    public static void printStringArray(ArrayList<String> stringArrayList){
        for(String s : stringArrayList){
            System.out.println(s);
        }
    }
}
