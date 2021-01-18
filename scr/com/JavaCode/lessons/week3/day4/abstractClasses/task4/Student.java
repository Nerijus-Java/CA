package com.JavaCode.lessons.week3.day4.abstractClasses.task4;

public class Student extends User {
    private int studentNr;

    public Student(String name, String surname, int studentNr) {
        super(name, surname);
        this.studentNr = studentNr;
    }

    @Override
    public String printUser() {
        return "Student:" + '\n' + getName() + '\n' + getSurname() + '\n' + this.studentNr;
    }

}
