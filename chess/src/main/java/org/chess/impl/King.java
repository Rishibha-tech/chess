package org.chess.impl;

import org.chess.piece.ChessPiece;

import java.util.Arrays;

public class King extends ChessPiece {
    public King(String type, String position) {
        this.type = type;
        this.position = position;
    }

    private static boolean validatePosition(String position) {
        char colIn = position.charAt(0);
        int rowIn = Integer.parseInt(position.substring(1));
        return colIn >= 'A' && colIn <= 'H' && rowIn >= 1 && rowIn <= 8;
    }

    @Override
    public String move() {
        char col= position.charAt(0);
        int row = Integer.parseInt(position.substring(1));
        String[] moves = new String[] {
                String.valueOf((col)) + (row + 1),
                String.valueOf((char) (col - 1)) + (row + 1),
                String.valueOf((char) (col + 1)) + (row + 1),
                String.valueOf((char) (col - 1)) + row,
                String.valueOf((char) (col + 1)) + row,
                String.valueOf((char) (col - 1)) + (row - 1),
                String.valueOf((char) (col + 1)) + (row - 1),
                String.valueOf( (col)) + (row - 1)
        };
        var list = Arrays.stream(moves).filter(King::validatePosition).toList();
        return String.join(", ", list);
    }
}
