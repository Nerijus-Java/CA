package com.JavaCode.lessons.week3.day2.other;

public class TestInheritance {

    public static void main(String[] args) {
        B b = new B();
        System.out.println("i = " + b.i);
        System.out.println("j = " + b.j);
    }
}

class A {
    int i;

    public A() {
        i = 5;
    }
}

class B extends A {
    int j;

    public B() {
        j = i + 1;
    }
}
