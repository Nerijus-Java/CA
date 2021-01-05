package com.JavaCode.lessons.week7.day2.innerClasses.task6;

import com.JavaCode.lessons.week7.day2.innerClasses.task5.IDay;

public class Task6 {

    public static void main(String[] args) {
        Hello3 hello3 = new Hello3();

        doSomeThing(hello3.goodMorning());
        doSomeThing(hello3.goodAfterNoon());
        doSomeThing(hello3.someDay());
    }

    public static void doSomeThing(IDay iDay){
        iDay.print();
    }
}
