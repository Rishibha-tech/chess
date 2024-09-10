package org.chess.impl;

import org.chess.piece.ChessPiece;
import org.chess.chessboard.ChessBoard;

public class Pawn extends ChessPiece {
    public Pawn(String type, String position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public String move() {
        char col = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));
        return  row < ChessBoard.noOfRows ? String.valueOf( col) + (row + 1) : position;



    }
}
