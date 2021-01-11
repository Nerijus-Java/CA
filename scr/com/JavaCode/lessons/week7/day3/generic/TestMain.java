package com.JavaCode.lessons.week7.day3.generic;

public class TestMain {

    public static void main(String[] args) {

        System.out.println('\n' + "Example " + "1");

        Integer number;
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        number = integerBox.get();
        System.out.println(number);

        //________________________________________________________________________________________

        System.out.println('\n' + "Example " + "2");

        Pair<Integer, String> pairOne = new OrderedPair<>(1, "One");
        System.out.println("Key :" + pairOne.getKey() + "  Value :" + pairOne.getValue());

        //________________________________________________________________________________________

        System.out.println('\n' + "Example " + "3");

        Box rawBox = new Box();
        rawBox.set("Java");
        rawBox.set(12);
        System.out.println((Integer) rawBox.get() + 2);

        //________________________________________________________________________________________

        System.out.println('\n' + "Example " + "4");

        Pair<Integer, String> pairTwo = new OrderedPair<>(2, "Two");
        Pair<Integer, String> pairTwoClone = new OrderedPair<>(2, "Two");

        boolean same = Util.compare(pairOne, pairTwo);
        boolean same2 = Util.compare(pairTwoClone, pairTwo);

        System.out.println(same);
        System.out.println(same2);

        //________________________________________________________________________________________

        System.out.println('\n' + "Example " + "5");

        Box<Number> numberBox = new Box<>();
        numberBox.set(15.5);
        integerBox.set(25);

        boxTest(numberBox);
        boxTest(integerBox);

        //________________________________________________________________________________________

        System.out.println('\n' + "Example " + "6");

        Box<String> stringBox = new Box<>();
        stringBox.set("test");

        printBox(numberBox);
        printBox(integerBox);

        //printBox(stringBox); has to extend number

        //________________________________________________________________________________________


    }

    public static <T extends Number> void boxTest(Box<T> numberBox) {
        System.out.println(numberBox.get());
    }

    public static void printBox(Box<? extends Number> box) {
        System.out.println(box.get());
    }
}
