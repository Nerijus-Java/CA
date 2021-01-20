package com.JavaCode.lessons.week9.day3.lan.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TaskMains {

    public static void main(String[] args) {

        Speed speed = x -> {
            System.out.println("My speed is " + x);
        };

        Speed speed2 = t -> {
            int x = t;
            for (int i = 0; i <= 5; i++) {
                System.out.println("My speed2 is " + x + i);
            }
        };
        speed.getSpeed(50);
        speed2.getSpeed(90);

        //----------------------------------------------------------------

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");


        list.forEach((item) -> System.out.println(item));

        //----------------------------------------------------------------

        Car car = new Car();
        car.addSpeed(new Speed() {
            @Override
            public void getSpeed(int i) {
                System.out.println("Speed is " + i);
            }
        });

        //----------------------------------------------------------------
        System.out.println();


        Car car2 = new Car();
        car2.addSpeed(x -> System.out.println("Speed is " + x));


        Function<String, String> function= s -> s + " Night";
        System.out.println(function.apply("Good"));

        StringToInt stringToInt = s -> Integer.parseInt(s);
        StringToInt stringToInt2 = Integer::parseInt;

        int val2 = stringToInt2.applyToInt("7");
        int val = stringToInt.applyToInt("5");

        System.out.println(val2);
        System.out.println(val);

        //----------------------------------------------------------------

        Function<String,Integer> stringIntegerFunction;
        stringIntegerFunction = StringUtils::convert;
        System.out.println(stringIntegerFunction.apply("7") + 7);

        //----------------------------------------------------------------

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("One");
        stringArrayList.add("Two");
        stringArrayList.add("Three");
        stringArrayList.add("Four");
        stringArrayList.add("Five");

        Function<ArrayList<String>,ArrayList<String>> arrayListFunction;
        arrayListFunction = ArrayListUtils::sort;
        System.out.println(arrayListFunction.apply(stringArrayList));

    }
}
