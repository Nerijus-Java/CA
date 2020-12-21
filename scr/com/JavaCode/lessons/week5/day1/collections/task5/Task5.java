package com.JavaCode.lessons.week5.day1.collections.task5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {
        Map<String, AutoInfo> stringAutoMap = new HashMap<>();

        stringAutoMap.put("One", new AutoInfo("VW", 1999, "fsa432", "D"));
        stringAutoMap.put("Two", new AutoInfo("BMW", 1995, "rwr432", "B"));

        System.out.println(stringAutoMap.get("One").toString());
        System.out.println(stringAutoMap.get("Two").toString());

    }
}
