package com.JavaCode.nd.nd4.chess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Board b = new Board();
        ChessPieceHelper chessPieceHelper = new ChessPieceHelper();

        String userInput = " ";

        while (!userInput.equals("-")) {
            b.fulfill();

            System.out.println("Choose a piece");
            userInput = sc.nextLine();
            ChessPiece chessPieceChosen = chessPieceHelper.pieceChosen(userInput);

            while (!userInput.equals("-")){
                b.fulfillChoose();
                System.out.println("would you like to move this chess piece? 1 = yes ,0 = no");
                userInput = sc.nextLine();

                if (userInput.equals("1")){
                    System.out.println("Enter where to");

                    userInput = sc.nextLine();
                    chessPieceHelper.chessPieceMove(chessPieceChosen,userInput);
                    break;
                }else if (userInput.equals("0")){
                    break;
                }
            }
        }
    }


}
