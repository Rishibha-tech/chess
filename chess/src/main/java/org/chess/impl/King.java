package org.chess.impl;

import org.chess.api.ChessPiece;

import java.util.Arrays;
import java.util.List;

public class King extends ChessPiece {
    public King(String type, String position) {
        this.type = type;
        this.position = position;
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
                String.valueOf((char) (col)) + (row - 1)
        };
        List<String> list = Arrays.stream(moves).filter(position -> {
             char colIn= position.charAt(0);
             int rowIn = Integer.parseInt(position.substring(1));
             if(colIn>='A' && colIn <='H' && rowIn >=1 && rowIn <=8) return true;
             else return false;
        }).toList();
        //String.join()
        return String.join(", ", list);
    }
}
