package com.JavaCode.lessons.week7.day2.files.task5a;

public class MyStringArray {

    private String[] array = new String[0];

    public MyStringArray() {

    }

    public void add(String s) {
        array = addMoreSpace(array.length + 1);
        array[array.length - 1] = s;
    }

    private String[] addMoreSpace(int lengthNeeded) {
        String[] newArray = new String[lengthNeeded];
        int count = 0;
        for (String s : array) {
            newArray[count] = s;
            count++;
        }
        return newArray;
    }

    public void resetArray() {
        this.array = new String[0];
    }

    //Getters

    public String[] getArray() {
        return array;
    }

    public String[] getReverseStringArray(){
        int count = array.length - 1;
        String[] newArray = new String[array.length];

        for (String s : array){
            newArray[count] = s;
            count--;
        }
        return newArray;
    }


}
