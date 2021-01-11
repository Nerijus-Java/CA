package com.JavaCode.lessons.week7.day2.innerClasses.task1;

public class OuterClass {
    int a = 1;
    int b = 3;
    public class Inner {
        int a = 2;

        void test(){
            System.out.println(OuterClass.this.a);
            System.out.println(a);
            System.out.println(b);
        }
    }
}
