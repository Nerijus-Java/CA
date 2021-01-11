package com.JavaCode.lessons.week7.day2.files.task5b;

public class StudentList {

    private Student[] array = new Student[0];
    private int studentCount = 0;

    public StudentList() {

    }

    public void add(Student s) {
        studentCount++;
        array = addMoreSpace(array.length + 1);
        array[array.length - 1] = s;
    }

    private Student[] addMoreSpace(int lengthNeeded) {
        Student[] newArray = new Student[lengthNeeded];
        int count = 0;
        for (Student s : array) {
            newArray[count] = s;
            count++;
        }
        return newArray;
    }

    public void resetArray() {
        this.array = new Student[0];
    }

    public Student makeSimpleStudent(){
        return new Student("Simple" + studentCount,"Simple" + studentCount,
                "Somewhere","Java", "Program");
    }

    //Getters

    public Student[] getArray() {
        return array;
    }

    public Student[] getReverseStringArray(){
        int count = array.length - 1;
        Student[] newArray = new Student[array.length];

        for (Student s : array){
            newArray[count] = s;
            count--;
        }
        return newArray;
    }
}
