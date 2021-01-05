package com.JavaCode.lessons.week7.day2.files.task5a;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTask5 {

    private MyStringArray stringArray = new MyStringArray();
    private String path ;

    public FileReaderTask5(String path) {
        this.path = path;
    }

    public void makeArray() {
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;

            stringArray.resetArray();

            while ((line = br.readLine()) != null) {
                stringArray.add(line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String print() {
        makeArray();
        String holder = "[ ";

        int count = 0;
        for (String s : stringArray.getArray()) {
            if (count == stringArray.getArray().length - 1){
                holder += s + " ]";
            } else {
                holder += s + ", ";
                count ++;
            }
        }
        return holder;
    }

    public String printReverse() {
        makeArray();
        String holder = "[ ";

        int count = 0;
        for (String s : stringArray.getReverseStringArray()) {
            if (count == stringArray.getArray().length - 1){
                holder += s + " ]";
            } else {
                holder += s + ", ";
                count ++;
            }
        }
        return holder;
    }

    public MyStringArray getStringArray() {
        return stringArray;
    }

}
