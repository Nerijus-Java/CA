package com.JavaCode.lessons.week9.day3.regex;

public class EmailChecker {

    public static final String REGEX_EMAIL = "[A-z0-9]+@[A-z]+[.]+[A-z]+";

    public boolean check(String email){
        if (email.matches(REGEX_EMAIL)){
            return true;
        }else {
            return false;
        }
    }
}
