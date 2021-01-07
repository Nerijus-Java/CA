package com.JavaCode.lessons.week7.day4.collections.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyStudentCollection<E extends Student>{

    Set<E> students = new HashSet<E>();

    public void add(E add){
        students.add(add);
    }

    public List<E> getAllStudentsByStudies(String studies){
        return null;
    }

    public List<E> getAllStudents(){
        List<E> list;
        return null;
    }

    public E getStudentByName(String name){
        for (E student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new NullPointerException("No student fount by name");
    }

    public int size(){
        return students.size();
    }
}
