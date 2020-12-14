package com.JavaCode.lessons.week4.day1.polmorfizmas.interfaceExample;

interface A{
    void af();
}
interface B{
    void bf();
}

class C implements A, B{

    @Override
    public void af() {
        System.out.println("af");
    }

    @Override
    public void bf() {
        System.out.println("bf");
    }
}
