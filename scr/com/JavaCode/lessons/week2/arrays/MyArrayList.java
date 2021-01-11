package com.JavaCode.lessons.week2.arrays;

public class MyArrayList {

    //testing
    private String[] strings;
    private static int arrayAmount;
    private String[] clone = new String[arrayAmount];

    public MyArrayList() {
        String[] stringArray = new String[1];
        this.strings =  stringArray;
        this.arrayAmount = strings.length;
    }

    public String[] addWord(String word){
        String[] cloneA = cloneArrayPlusOne(strings);
         int newArrayAmount = arrayAmount - 1;
        cloneA[newArrayAmount -1] = word;
        return clone;
    }

    public String getWord(int arrayNumber){
        return strings[arrayNumber];
    }

    private void reset(String[] strings){
        this.strings = new String[this.arrayAmount = this.arrayAmount + 1];
    }

    private String[] cloneArrayPlusOne(String[] strings){
        String[] newStrings = new String[arrayAmount = this.arrayAmount + 1];
        int count = 0;
        for (String s : strings){
            newStrings[count] = s;
            count++;
        }
        return newStrings;
    }

}
