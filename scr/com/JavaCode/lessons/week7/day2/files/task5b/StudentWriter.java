package com.JavaCode.lessons.week7.day2.files.task5b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {

    private String path;
    private StudentList studentList = new StudentList();

    public StudentWriter(String path) {
        this.path = path;
    }

    public void addStudentToList(Student student){
        studentList.add(student);
    }

    public void WriteAllStudents() {
        for(Student s : studentList.getArray()){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                bw.write(s.toString());
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void addSimpleStudent(){
        addStudentToList(studentList.makeSimpleStudent());
    }


}
