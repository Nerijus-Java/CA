package com.JavaCode.lessons.week3.day1.contructor.task2;

public class TaskFinal {

    private String name;
    private int age;

    public TaskFinal() {
        this.name = "Nerijus";
        this.age = 18;
        System.out.println(name + " " + age);
    }

    void priskirk(){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

}
