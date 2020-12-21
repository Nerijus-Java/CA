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
        ChessPieceHelper chessPieceHelper = new ChessPieceHelper();

        Knight knightOne = new Knight();
        ChessPieceHelper.chessPieceList.addChessPiece(knightOne);

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                if (i == knightOne.getY() && j == knightOne.getX()) {
                    System.out.print(knightOne.printChessPiece() + "\t");
                } else {
                    area[i][j] = letters[j] + numbers[i];
                    System.out.print(area[i][j] + "\t");
                }

            }
            System.out.println();
        }

    }

    void fulfillChoose() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        ChessPieceHelper chessPieceHelper = new ChessPieceHelper();

        Knight knightOne = new Knight();
        chessPieceHelper.chessPieceList.addChessPiece(knightOne);

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                if (i == knightOne.getY() && j == knightOne.getX()) {
                    System.out.print(knightOne.printChessPiece() + "\t");
                } else {
                    area[i][j] = letters[j] + numbers[i];
                    System.out.print(area[i][j] + "\t");
                }

            }
            System.out.println();
        }

    }
}
