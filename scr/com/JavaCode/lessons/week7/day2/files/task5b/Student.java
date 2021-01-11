package com.JavaCode.lessons.week7.day2.files.task5b;

public class Student {

    private String name;
    private String surname;
    private String address;
    private String course;
    private String program;

    public Student(String name, String surname, String address, String course, String program) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.course = course;
        this.program = program;
    }


    @Override
    public String toString() {
        return name + "," + surname + "," + address + "," + course + "," + program;
    }
}
