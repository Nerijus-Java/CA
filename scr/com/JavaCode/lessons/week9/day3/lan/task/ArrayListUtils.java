package com.JavaCode.lessons.week9.day3.lan.task;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListUtils {

    public static ArrayList<String> sort(ArrayList<String> value){
        value.stream().sorted()
        .collect(Collectors.toList());
        return value;
    }
}
