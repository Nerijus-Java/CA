package com.JavaCode.lessons.nd.nd4.chess;

public class ChessPieceList {

    ChessPiece[] chessPieces = new ChessPiece[1];
    int listLength = chessPieces.length;

    public void addChessPiece(ChessPiece chessPiece) {
        ChessPiece[] newChessPieces = new ChessPiece[listLength + 1];
        for (int i = 0; i < listLength; i++) {
            if (chessPieces[i] == null) {
                newChessPieces[i] = chessPiece;
            } else {
                newChessPieces[i] = chessPieces[i];
            }
        }
        this.chessPieces = newChessPieces;
    }
}
