package com.JavaCode.lessons.week3.day2.inheritance.task3;

public class Student extends Person {
    private int studentId;

    public Student(String name, String surname, int age, int studentId) {
        super(name, surname, age);
        this.studentId = studentId;
    }

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String getInfo() {
        return "Name :" + getName() + '\n'
                + "Surname :" + getSurname() + '\n'
                + "Age :" + getAge() + '\n'
                + "ID :" + studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
