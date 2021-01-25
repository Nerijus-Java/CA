package com.JavaCode.lessons.week10.day1;

public class Main {

    public static void main(String[] args) {

        //create class with null
        //vvvvvvvvvvvvvvvvvvvvvvvv
        A a = null;
        //^^^^^^^^^^^^^^^^^^^^^^^

        for (int i = 0; i < 10; i++) {

            //get constructor from the class
            //vvvvvvvvvvvvvvvvvvvvvvvv
            a = A.getInstance();
            //^^^^^^^^^^^^^^^^^^^^^^^
            a.setText(i + " ");
            System.out.println(a.getText());
        }
        System.out.println();
        System.out.println(a.getText());

        //to use the class again reset the class to null or get it from the class again
        //vvvvvvvvvvvvvvvvvvvvvvvv
        a = null;

        for (int i = 5; i < 15; i++) {
            a = A.getInstance();
            a.setText(i + " ");
            System.out.println(a.getText());
        }
        System.out.println();
        System.out.println(a.getText());
        //^^^^^^^^^^^^^^^^^^^^^^^

        a = null;
    }
}
