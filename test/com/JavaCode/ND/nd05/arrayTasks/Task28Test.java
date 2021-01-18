package com.JavaCode.ND.nd05.arrayTasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task28Test {
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] arrayTwo = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 50};

    @Test
    public void testOne(){
        assertEquals(8,Task28.difOfMaxAndMinValueInArray(array));
    }
    @Test
    public void testTwo(){
        assertEquals(49,Task28.difOfMaxAndMinValueInArray(arrayTwo));
    }
}