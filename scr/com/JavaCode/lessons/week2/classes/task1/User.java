package com.JavaCode.lessons.week2.classes.task1;

public class User {
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String printUser(){
        return "Name: " + this.name + '\n' + "Age: " + this.age + '\n'+ "------------------";
    }

}
