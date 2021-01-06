package com.JavaCode.lessons.week7.day3.generic;

public class Box <T>{

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
