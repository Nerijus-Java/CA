package com.JavaCode.lessons.week7.day4.collections.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStudentCollectionTest {

    MyStudentCollection<Student> studentCollection;

    @Before
    public void test() {
        studentCollection = new MyStudentCollection<>();
        studentCollection.add(new Student("Nerjius", "java"));
        studentCollection.add(new Student("James", "Math"));
    }

    @Test
    public void testAdd() {
        studentCollection.add(new Student("reece","French"));
        assertEquals(3,studentCollection.size());
    }

    @Test
    public void testGetStudentByName() {
        Student studentOne = new NewStudent("Jeremy", "Physics");
        studentCollection.add(studentOne);
        assertEquals(studentOne,studentCollection.getStudentByName("Jeremy"));
    }

    @Test
    public void testSize() {
        assertEquals(2, studentCollection.size());
    }

    @Test
    public void testSizeWithAdd() {
        assertEquals(2, studentCollection.size());
        studentCollection.add(new Student("Max", "English"));
        assertEquals(3, studentCollection.size());
    }

    @Test
    public void testSizeWithSameAdd() {
        studentCollection.add(new Student("Max", "English"));
        assertEquals(3, studentCollection.size());
    }
}