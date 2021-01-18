package com.JavaCode.lessons.week4.day1.polmorfizmas.interfaceExample;

public class Example {

    public static void main(String[] args) {
        C cc = new C();
        A aa = cc;
        aa.af();
        B bb = cc;
        bb.bf();
    }
}
