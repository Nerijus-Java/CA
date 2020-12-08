package com.JavaCode.lessons.week3.day2.array.timesTabel;

public class TimeTable {

    public static void main(String[] args) {
        int[] timeTable = {
                1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11, 12, 13,
                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40
        };
        printTimesTable(timeTable);
    }

    private static void times(int[] timesTable, int timesBy) {
        for (int i = 0; i < 40; i++) {
            System.out.printf("%-5s", timesTable[i] * timesBy + " ");
        }
        System.out.println();
    }

    public static void printTimesTable(int[] timeTable) {
        for (int i = 1; i < 41; i++) {
            times(timeTable, i);
        }
    }
}
