package com.JavaCode.lessons.week3.day1.oeratores.task2;

public class PrintLines {

    private int amount;

    protected PrintLines(int amount) {
        this.amount = amount;
    }

    protected String printLine() {
        String holder = "";
        for (int i = 0; i < this.amount; i++) {
            holder += "* " + "\n";
        }
        return holder;
    }
}
