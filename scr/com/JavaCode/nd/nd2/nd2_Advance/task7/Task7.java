package com.JavaCode.nd.nd2.nd2_Advance.task7;

public class Task7 {

    final static int LOOP_NUMBER = 50;

    public static void main(String[] args) {

        for (int i = 0; i < LOOP_NUMBER; i++) {
            if (i == LOOP_NUMBER - 1) {
                System.out.print(getPenNumber(i));
            } else {
                System.out.print(getPenNumber(i) + ",");
            }
        }

    }

    public static int getPenNumber(int num) {
        return (num * (3 * num - 1)) / 2;
    }
}
