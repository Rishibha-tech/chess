package org.chess.impl;

import org.chess.api.ChessPiece;
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

        if (row < (ChessBoard.noOfRows)) {
            return String.valueOf( col) + (row + 1);
        } else {
            return "";
        }


    }
}
