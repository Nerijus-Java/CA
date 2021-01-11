package com.JavaCode.lessons.week7.day2.files.task5a;

public class Task5 {

    public static final String PATH = "scr/com/JavaCode/lessons/week7/day2/files/task5a/task5";

    public static void main(String[] args) {
        FileReaderTask5 fr = new FileReaderTask5(PATH);
        System.out.println(fr.printReverse());
        System.out.println(fr.print());

    }
}
