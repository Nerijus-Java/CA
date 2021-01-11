package com.JavaCode.lessons.week6.day2.exeptions.task1;

public class Other {

    public static void main(String[] args) {
        String t = null;
        nullPointerException(t);
    }

    public static void nullPointerException(String t){
        if (t == null){
            throw new NullPointerException("Opps");
        }
    }
}
