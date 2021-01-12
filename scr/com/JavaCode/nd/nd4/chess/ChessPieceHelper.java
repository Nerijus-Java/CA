package com.JavaCode.ND.nd4.chess;

public class ChessPieceHelper {

    static ChessPieceList chessPieceList = new ChessPieceList();

    public ChessPiece pieceChosen(String input) throws Exception {

        String xLetter = input.substring(0, 1);
        int x = stringToNumber(xLetter);
        int y = Integer.parseInt(input.substring(1, 2)) - 1;

        if (doesPieceExist(x, y)) {
            return getChessPiece(x, y);
        } else {
            throw new Exception("Piece does not exist");
        }
    }

    public void chessPieceMove(ChessPiece chessPiece, String input) {

        String xLetter = input.substring(0, 1);
        int x = stringToNumber(xLetter);
        int y = Integer.parseInt(input.substring(1, 2)) - 1;
        if (canPieceMove(chessPiece, x, y)) {
            chessPiece.setX(x);
            chessPiece.setY(y);
        }
    }

    public ChessPiece[] getChessPieceList() {
        return chessPieceList.chessPieces;
    }

    private boolean canPieceMove(ChessPiece chessPiece, int x, int y) {
        for (Move m : chessPiece.getMoves()) {
            if (x == m.getX() && y == m.getY()) {
                return true;
            }
        }
        return false;
    }

    private boolean doesPieceExist(int x, int y) {

        for (ChessPiece p : getChessPieceList()) {
            if (p.getX() == x && p.getY() == y) {
                return true;
            }
        }
        return false;
    }

    private ChessPiece getChessPiece(int x, int y) {
        for (ChessPiece p : chessPieceList.chessPieces) {
            if (p.getX() == x && p.getY() == y) {
                return p;
            }
        }
        return null;
    }

    private int stringToNumber(String x) {

        switch (x.toUpperCase()) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            default:
                return 7;
        }
    }

}
