package com.JavaCode.lessons.nd.nd4.chess;

/**
 * Created by root on 2017.01.03.
 */
public class Knight implements ChessPiece{
    private int y ;
    private int x ;
    private Move[] moves = new Move[8];

    public Knight() {
        y = 0;
        x = 6;
    }

    public void wherePieceCanMove(){
        moves[0] = new Move(x + 1,y + 2);
        moves[1] = new Move(x - 1,y + 2);
        moves[2] = new Move(x + 1,y - 2);
        moves[3] = new Move(x - 1,y - 2);
        moves[4] = new Move(x - 2,y + 1);
        moves[5] = new Move(x - 2,y - 1);
        moves[6] = new Move(x + 2,y + 1);
        moves[7] = new Move(x + 2,y - 1);
    }

    public String printChessPiece(){
        return "♘";
    }

    public Move[] getMoves() {
        return moves;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }


}
