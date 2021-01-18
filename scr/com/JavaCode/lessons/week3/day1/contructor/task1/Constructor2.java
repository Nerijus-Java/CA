package com.JavaCode.lessons.week3.day1.contructor.task1;

public class Constructor2 {
    private int age;

    public Constructor2() {
        Constructor1 constructor1 = new Constructor1(5);
        this.age = constructor1.getAge();
    }

    public int getAge() {
        return age;
    }
}
