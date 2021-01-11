package com.JavaCode.lessons.week7.day4.collections.task1;

import java.util.Objects;
import java.util.Random;

public class Student {

    private String name;
    private String StudiesProgram;
    private Random random = new Random();

    public Student(String name, String studiesProgram) {
        this.name = name;
        StudiesProgram = studiesProgram;
    }

    public int hashCode() {
        return random.nextInt(1000);
    }

    public String getName() {
        return name;
    }

    public String getStudiesProgram() {
        return StudiesProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(StudiesProgram, student.StudiesProgram);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "name :" + name + "  StudiesProgram :" + StudiesProgram + '\n';
    }

}
