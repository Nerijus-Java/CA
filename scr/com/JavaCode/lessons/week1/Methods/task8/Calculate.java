package com.JavaCode.lessons.week1.Methods.task8;

public class Calculate {
    private int a;
    private int b;
    private int c;

    public Calculate(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add (int a , int b){
        return a + b;
    }
    public int add (int a , int b , int c){
        return a + b + c;
    }
}
