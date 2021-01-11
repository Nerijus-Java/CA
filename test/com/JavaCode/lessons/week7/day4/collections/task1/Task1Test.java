package com.JavaCode.lessons.week7.day4.collections.task1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void addToSet(){
        Set<Student> students = new HashSet<>();

        assertTrue(students.add(new Student("Nerijus", "Java")));
        assertTrue(students.add(new Student("James", "Java")));

        assertFalse(students.add(new Student("James", "Java")));

        assertEquals(2,students.size());
    }
}