package com.JavaCode.lessons.week7.day1.files.examples;

import java.io.FileInputStream;
import java.io.InputStream;

public class Reader {

    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("scr/com/JavaCode/lessons/week7/day1/files/other/Reader.java")){
            int numbersCode;
            while((numbersCode = in.read()) > 0){
                System.out.print(numbersCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}