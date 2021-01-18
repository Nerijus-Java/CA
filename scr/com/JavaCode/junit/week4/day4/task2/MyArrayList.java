package com.JavaCode.junit.week4.day4.task2;

public class MyArrayList {

    public static final int STARING_INTEGER = 0;
    public static final int ADD_ONE = 1;
    private String[]myArray;

    public MyArrayList() {
        this.myArray = new String[STARING_INTEGER];
    }

    public int getSize(){
        return this.myArray.length;
    }

    public void add(String text) {
        String[]newArray = new String[myArray.length + ADD_ONE];
        int count = 0;
        for (String s : myArray){
            newArray[count] = myArray[count];
        }
        newArray[count] = text;
        this.myArray = newArray;
    }
}
