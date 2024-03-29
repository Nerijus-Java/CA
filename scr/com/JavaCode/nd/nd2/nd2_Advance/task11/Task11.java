package com.JavaCode.nd.nd2.nd2_Advance.task11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc.nextLine();

        if (isPasswordValid(password)){
            System.out.println("Password is valid");
        }else {
            System.out.println("Password is not valid");
        }
    }

    public static boolean isPasswordValid(String password) {
        if (password.length() < 10) {
            return false;
        } else if (!doesPasswordContainNumbers(password)){
            return false;
        }else if (!doesPasswordContainLetters(password)){
            return false;
        }else {
            return true;
        }
    }

    private static boolean doesPasswordContainNumbers(String password) {
        for (char c : password.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean doesPasswordContainLetters(String password){
        char upperCase;
        for (char c : password.toCharArray()){
            upperCase = Character.toUpperCase(c);
            if (upperCase >= 'A' && upperCase <= 'Z'){
                return true;
            }
        }
        return false;
    }
}
