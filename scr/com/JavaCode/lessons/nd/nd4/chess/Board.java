package com.JavaCode.lessons.nd.nd4.chess;

/**
 * Created by root on 2017.01.03.
 */
public class Board {
    int width = 8;
    int height = 8;
    String area[][] = new String[height][width];
    Knight knightOne = new Knight();

    void fulfill() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        ChessPieceHelper chessPieceHelper = new ChessPieceHelper();

        ChessPieceHelper.chessPieceList.addChessPiece(knightOne);
        knightOne.wherePieceCanMove();

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

        chessPieceHelper.chessPieceList.addChessPiece(knightOne);

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < width; j++) {
                if (i == knightOne.getY() && j == knightOne.getX()) {
                    System.out.print(knightOne.printChessPiece() + "\t");
                } else if (canMove(i,j,knightOne)){
                    System.out.print("⛆" + "\t");
                } else {
                    area[i][j] = letters[j] + numbers[i];
                    System.out.print(area[i][j] + "\t");
                }

            }
            System.out.println();
        }

    }

    private boolean canMove(int x ,int y, ChessPiece chessPiece){
        chessPiece.wherePieceCanMove();
        for (Move move : chessPiece.getMoves()){
            if (move.getY() == x && move.getX() == y){
                return true;
            }
        }
        return false;
    }
}