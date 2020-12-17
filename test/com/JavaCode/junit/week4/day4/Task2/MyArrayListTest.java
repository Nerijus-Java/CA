package com.JavaCode.junit.week4.day4.Task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    public static final String TEXT = "Text";
    public MyArrayList myArrayList;

    @Before
    public void first(){
        this.myArrayList = new MyArrayList();
    }

    @Test
    public void isArraySizeBiggerThanZero(){
        Assert.assertEquals(0,myArrayList.getSize());
    }

    @Test
    public void isArraySizeBigger(){
        this.myArrayList.add(TEXT);
        Assert.assertEquals(1,myArrayList.getSize());
    }
}
