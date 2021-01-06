package com.JavaCode.lessons.week7.day3.generic.tasks.task1;

public class Task1 {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[]{"One", "Two", "Three", "Four", "Five", "Six"};

        GenericClass<Integer> arrayI = new GenericClass<>(intArray);
        GenericClass<String> arrayS = new GenericClass<>(stringArray);

        System.out.println(arrayI.toString());
        System.out.println(arrayS.toString());
    }
}
