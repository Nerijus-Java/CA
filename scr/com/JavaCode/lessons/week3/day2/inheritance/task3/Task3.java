package com.JavaCode.lessons.week3.day2.inheritance.task3;

public class Task3 {

    public static void main(String[] args) {
        Person personOne = new Person("Nerijus", "Viliusis", 18);
        System.out.println(personOne.getInfo());

        System.out.println();

        Student studentOne = new Student("Nerijus", "Viliusis", 18, 5241);
        System.out.println(studentOne.getInfo());

        System.out.println();

        Student studentTwo = new Student("James","May",25);
        studentTwo.setStudentId(6523);
        System.out.println(studentTwo.getInfo());

    }
}
