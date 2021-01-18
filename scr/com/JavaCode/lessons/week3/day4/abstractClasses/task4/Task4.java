package com.JavaCode.lessons.week3.day4.abstractClasses.task4;

public class Task4 {

    public static void main(String[] args) {
        User teacher = new Teacher("Someone", "Something", 2341);
        System.out.println(teacher.printUser());

        System.out.println();

        User student = new Student("Nerijus", "Viliusis", 5241);
        System.out.println(student.printUser());
    }
}
