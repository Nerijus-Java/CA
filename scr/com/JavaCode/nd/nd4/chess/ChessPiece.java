package com.JavaCode.ND.nd4.chess;

interface ChessPiece {

    void wherePieceCanMove();

    String printChessPiece();

    int getY();
    int getX();

    void setY(int y);
    void setX(int x);

    Move[] getMoves();
}
