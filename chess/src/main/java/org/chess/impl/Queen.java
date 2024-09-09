package org.chess.impl;

import org.chess.api.ChessPiece;
import org.chess.chessboard.ChessBoard;

public class Queen extends ChessPiece {
    public Queen(String type, String position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public String move() {
        char col = position.charAt(0);
        int row = Integer.parseInt(position.substring(1)) - 1;
        String[] moves = new String[] {
                String.valueOf((char) (col + 1)) + (row + 1),
                String.valueOf((char) (col - 1)) + (row + 1),
                String.valueOf((char) (col + 1)) + row,
                String.valueOf((char) (col - 1)) + row,
                String.valueOf((char) (col + 1)) + (row - 1),
                String.valueOf((char) (col - 1)) + (row - 1),
                String.valueOf((char) (col + 1)) + (row - 1),
                String.valueOf((char) (col - 1)) + (row - 1)
        };
        for (int i = 1; i < 8; i++) {
            moves = addMove(moves, (char) (col + i), row);
            moves = addMove(moves, (char) (col - i), row);
            moves = addMove(moves, col, row + i);
            moves = addMove(moves, col, row - i);
        }
        return String.join(", ", moves);
    }

    private String[] addMove(String[] moves, char col, int row) {
        while (0 <= row && row < ChessBoard.noOfRows && col < ChessBoard.noOfColumns) {
            moves = addMove(moves, col, row);
            col += (col > 0) ? 1 : -1;
            row += (row > 0) ? 1 : -1;
        }
        return moves;
    }
}
