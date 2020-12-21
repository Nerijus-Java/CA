package com.JavaCode.lessons.nd.nd4.chess;

/**
 * Created by root on 2017.01.03.
 */
public class Knight implements ChessPiece{
    private int y ;
    private int x ;
    private Move[] moves;

    public Knight() {
        y = 0;
        x = 6;
    }

    public void wherePieceCanMove(){

        Move move1 = new Move(x + 1,y + 2);
        Move move2 = new Move(x - 1,y + 2);
        Move move3 = new Move(x + 1,y - 2);
        Move move4 = new Move(x - 1,y - 2);
        Move move5 = new Move(x - 2,y + 1);
        Move move6 = new Move(x - 2,y - 1);
        Move move7 = new Move(x + 2,y + 1);
        Move move8 = new Move(x + 2,y - 1);


    }

    public String printChessPiece(){
        return "♘";
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
