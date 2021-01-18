package com.JavaCode.lessons.week5.day1.collections.task1;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("zero");
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");

        System.out.println(stringList.get(3));
        System.out.println("Size :" + stringList.size());

        stringList.remove(2);
        stringList.set(2, "two");

        System.out.println(stringList.get(2));
        System.out.println(stringList);

        stringList.clear();
        stringList.add("cleared");
        System.out.println(stringList);

        System.out.println();

        //---------------------------------------------------------

        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Nerijus", 18));
        userArrayList.add(new User("someone", 28));
        userArrayList.add(new User("someone two", 58));
        userArrayList.add(new User("someone three", 68));

        System.out.println(userArrayList.get(2).toString());

        userArrayList.set(2, new User("NewPerson", 42));

        System.out.println(userArrayList.get(2).toString());

        System.out.println();
        //---------------------------------------------------------

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(5);
        integerArrayList.add(3);
        integerArrayList.add(2);
        integerArrayList.add(6);
        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.size());
        integerArrayList.remove(0);
        integerArrayList.set(1,45);
        integerArrayList.set(2,43);

        System.out.println(integerArrayList.indexOf(45));
        System.out.println(integerArrayList);
    }

}
