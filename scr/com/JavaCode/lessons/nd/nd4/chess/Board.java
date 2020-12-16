package com.JavaCode.lessons.nd.nd4.chess;

/**
 * Created by root on 2017.01.03.
 */
public class Board {
    int width = 8;
    int height = 8;
    String area[][] = new String[height][width];

    void fulfill() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        for (int i = numbers.length-1; i >=0; i--) {
            for (int j = 0; j < width; j++) {
                area[i][j] = letters[j] + numbers[i];
                System.out.print(area[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
