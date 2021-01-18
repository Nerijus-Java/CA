package com.JavaCode.lessons.week7.day1.files.examples;

import java.io.*;

public class Copy {

    public static final String PATH_COPY = "scr/com/JavaCode/lessons/week7/day1/files/other/copy.txt";
    public static final String PATH_ORIG = "scr/com/JavaCode/lessons/week7/day1/files/other/orig.txt";

    public static void main(String[] args) throws IOException {
        try (InputStream in = new FileInputStream(PATH_ORIG);
             OutputStream out = new FileOutputStream(PATH_COPY)) {
            for (int c; (c = in.read()) != -1; ) {
                out.write(c);
            }
        }
    }
}
