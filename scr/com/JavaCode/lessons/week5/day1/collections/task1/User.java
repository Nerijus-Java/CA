package com.JavaCode.lessons.week5.day1.collections.task1;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User" + '\n' +
                "name :" + name + '\n' +
                "age :" + age;
    }
}
