package com.JavaCode.lessons.week7.day1.files.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBuffer {

    public static final String PATH_ORIG = "scr/com/JavaCode/lessons/week7/day1/files/other/orig.txt";

    public static void main(String[] args) {
        char[] chars = new char[]{'H', 'e', 'l', 'l', 'o'};
        String content = "Write ";

        /*
        try catch and objectives created and if FileWriter append is true (Does not delete file (writes on top)).
        & if file not found ,file is created.
        & Don't need bm.close() if in try catch box.
        */

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_ORIG, true))) {
            //write
            bw.write(content);
            bw.newLine();
            bw.write("3");
            bw.newLine();
            bw.write(chars);

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
