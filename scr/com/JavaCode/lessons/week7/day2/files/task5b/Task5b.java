package com.JavaCode.lessons.week7.day2.files.task5b;

public class Task5b {

    public static final String STUDENT_TXT_PATH = "scr/com/JavaCode/lessons/week7/day2/files/task5b/allStudents";

    public static void main(String[] args) {

        StudentWriter studentWriter = new StudentWriter(STUDENT_TXT_PATH);
        StudentReader studentReader = new StudentReader(STUDENT_TXT_PATH);

        for (int i = 0; i < 10; i++) {
            studentWriter.addSimpleStudent();
        }
        studentWriter.WriteAllStudents();


        Student[] studentsFromFile = studentReader.getStudentArray();
        for (Student s : studentsFromFile){
            System.out.println(s.toString());
        }
    }
}
