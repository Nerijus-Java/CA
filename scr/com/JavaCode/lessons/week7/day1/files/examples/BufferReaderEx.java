package com.JavaCode.lessons.week7.day1.files.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {

    public static final String PATH_ORIG = "scr/com/JavaCode/lessons/week7/day1/files/examples/orig.txt";

    /*
    For small file for 200mb or under.
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(PATH_ORIG);

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        while((line = br.readLine()) != null){
            if (line.equals("")){

            } else {
                System.out.println(line);
            }
        }
        br.close();
    }
}
