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
                String.valueOf((char) (col - 1)) + (row - 1), // south west
                String.valueOf((char) (col - 1)) + row, // west
                String.valueOf((char) (col + 1)) + (row + 1), // north west
                String.valueOf( (col)) + (row - 1), //south
                String.valueOf((col)) + (row + 1), // north
                String.valueOf((char) (col + 1)) + (row - 1), // south east
                String.valueOf((char) (col + 1)) + row, //east
                String.valueOf((char) (col - 1)) + (row + 1), // north east



        };
        var list = Arrays.stream(moves).sorted().filter(King::validatePosition).toList();
        return String.join(", ", list);
    }
}
