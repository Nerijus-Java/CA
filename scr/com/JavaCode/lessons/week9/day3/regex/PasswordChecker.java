package com.JavaCode.lessons.week9.day3.regex;

public class PasswordChecker {

    public boolean check(String password) {
        if (password.matches("[A-z0-9]")) {
            return true;
        } else {
            return false;
        }
    }
}
