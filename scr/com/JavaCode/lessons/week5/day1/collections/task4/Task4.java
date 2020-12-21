package com.JavaCode.lessons.week5.day1.collections.task4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {
        Map<Integer,String> integerStringMap = new HashMap<>();

        integerStringMap.put(1,"One");
        integerStringMap.put(2,"two");
        integerStringMap.put(3,"three");
        integerStringMap.put(4,"four");

        System.out.println(integerStringMap.get(2));
        System.out.println(integerStringMap.size());

        System.out.println(integerStringMap.keySet());

        integerStringMap.remove(1);
        integerStringMap.remove(2);
        integerStringMap.remove(3);
        integerStringMap.remove(4);
        System.out.println(integerStringMap);

        integerStringMap.put(1,"One");
        integerStringMap.put(1,"newOne");
        integerStringMap.put(2,"two");
        integerStringMap.put(3,"three");
        integerStringMap.put(4,"four");

        System.out.println(integerStringMap);
    }
}
