package com.JavaCode.lessons.week10.day1;

public class A {
    private static A a = null;

    private String text = "";

    private A() {
    }

    public static A getInstance() {
        if (a == null){
            a = new A();
        }
        return a;
    }

    public void setText(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }
}
