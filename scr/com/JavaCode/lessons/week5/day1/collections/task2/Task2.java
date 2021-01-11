package com.JavaCode.lessons.week5.day1.collections.task2;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");

        System.out.println(stringSet.size());
        stringSet.remove("one");
        stringSet.remove("two");
        stringSet.remove("three");
        stringSet.remove("four");
        stringSet.remove("five");

        System.out.println(stringSet);

        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");

        System.out.println(stringSet);
    }
}
