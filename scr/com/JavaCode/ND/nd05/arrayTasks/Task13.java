package com.JavaCode.ND.nd05.arrayTasks;

public class Task13 {
    //13. Write a Java program to find the duplicate values of an array of string values.

    public static void main(String[] args) {
        String[] stringsOne = new String[]{"One", "Two", "Three", "four"};
        String[] stringsTwo = new String[]{"1", "Two", "3", "4"};

        System.out.println(findDupe(stringsOne,stringsTwo));

    }

    public static String findDupe(String[] strings, String[] strings2) {
        if (checkForDupes(strings, strings2)){
            for (String s : strings) {
                for (String s1 : strings2) {
                    if (s.equals(s1)) {
                        return "dupe :" + s;
                    }
                }
            }
        }
        return "No dupes";

    }

    public static boolean checkForDupes(String[] strings, String[] strings2) {
        for (String s : strings) {
            for (String s1 : strings2) {
                if (s.equals(s1)) {
                    return true;
                }
            }
        }
        return false;
    }

}
