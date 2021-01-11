package com.JavaCode.lessons.week7.day1.files.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Writer {

    public static final String PATH = "scr/com/JavaCode/lessons/week7/day1/files/other/orig.txt";

    public static void main(String[] args) {
        char[] text = {'L','a','b','a','s'};

        try(OutputStream os = new FileOutputStream(PATH, true)){
            for (char c : text){
                os.write(c);
            }
            os.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
