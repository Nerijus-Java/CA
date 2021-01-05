package com.JavaCode.lessons.week7.day2.innerClasses.task3;

public class OuterAndInner {

    int a = 1;
    int b = 3;
    public static class Inner {
        int a = 2;

        void test(){
            System.out.println(a);
        }
    }
}
