package com.JavaCode.lessons.week7.day4.collections.task1;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Nerijus", "Java"));
        studentSet.add(new Student("James", "Java"));
        studentSet.add(new Student("something", "Java"));

        //Duplicates
        studentSet.add(new Student("Nerijus", "Java"));
        studentSet.add(new Student("James", "Java"));
        studentSet.add(new Student("something", "Java"));

        //Methods
        forEachPrint(studentSet);
        System.out.println("______________________________________________");

        integratorWhilePrint(studentSet);
        System.out.println("______________________________________________");

        forEachLan(studentSet);
        System.out.println("______________________________________________");

        whilePrint(studentSet);
        System.out.println("______________________________________________");

    }

    public static void whilePrint(Set<Student> students){
        Iterator<Student> studentIterator = students.iterator();
        Student sPrint ;
        try {
            while ((sPrint = studentIterator.next()) != null){
                System.out.println(sPrint.toString());
            }
        }catch (NoSuchElementException ignored){
        }
    }

    public static void forEachLan(Set<Student> students) {
        students.forEach(student -> System.out.println(student.toString()));
    }

    public static void integratorWhilePrint(Set<Student> students) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student s = studentIterator.next();
            System.out.println(s.toString());
        }
    }

    public static void forEachPrint(Set<Student> students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

}
