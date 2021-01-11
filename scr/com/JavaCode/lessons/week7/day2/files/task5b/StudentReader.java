package com.JavaCode.lessons.week7.day2.files.task5b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentReader {

    private StudentList studentListArray = new StudentList();
    private String path ;

    public StudentReader(String path) {
        this.path = path;
    }

    public void makeArray() {
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;

            studentListArray.resetArray();

            while ((line = br.readLine()) != null) {
                studentListArray.add(lineToStudent(line));
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student[] getStudentArray(){
        makeArray();
        return studentListArray.getArray();
    }

    public String print() {
        makeArray();
        String holder = "";

        int count = 0;
        for (Student s : studentListArray.getArray()) {
            holder += s.toString() + '\n';
        }
        return holder;
    }

    public String printReverse() {
        makeArray();
        String holder = "";

        int count = 0;
        for (Student s : studentListArray.getReverseStringArray()) {
            if (count == studentListArray.getArray().length - 1){
                holder += s ;
            } else {
                holder += s + ", ";
                count ++;
            }
        }
        return holder;
    }

    public StudentList getStudentListArray() {
        return studentListArray;
    }

    private Student lineToStudent(String line){
        int lineCount = 0;
        String holder = "";
        String[] studentDetails = new String[5];

        for (char c : line.toCharArray()) {
            if (c != ','){
                holder += c;
            } else {
                studentDetails[lineCount] = holder;
                lineCount++;
                holder = "";
            }
        }
        studentDetails[4] = holder;
        return new Student(studentDetails[0],studentDetails[1],studentDetails[2],studentDetails[3],studentDetails[4]);
    }

}
