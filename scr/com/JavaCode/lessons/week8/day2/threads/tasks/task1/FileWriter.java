package com.JavaCode.lessons.week8.day2.threads.tasks.task1;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

    public static final String PATH = "scr/com/JavaCode/lessons/week8/day2/threads/tasks/task1/NumbersEntered";

    public void write(int write) {
        try (BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(PATH, true))) {
            if (write != 0){
                bw.write(String.valueOf(write));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
