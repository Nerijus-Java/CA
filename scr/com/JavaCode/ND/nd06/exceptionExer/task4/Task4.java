package com.JavaCode.ND.nd06.exceptionExer.task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = null;
        String text;

        try {
            text = sc.nextLine();
            System.out.println(text);
        }catch (NullPointerException e){
            System.err.println("Error: Scanner is null");
        }
    }
}
