package org.chess.impl;

import org.chess.piece.ChessPiece;
import org.chess.chessboard.ChessBoard;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPiece {

    public Queen(String type, String position) {
        this.type = type;
        this.position = position;
    }


    @Override
    public String move() {


        char col = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));
        ArrayList<String> moves = new ArrayList<>();
        addNorthMove(moves,col,row);
        addSouthMove(moves,col,row);
        addEastMove(moves,col,row);
        addWestMove(moves,col,row);
        addNorthEastMove(moves,col,row);
        addNorthWestMove(moves,col,row);
        addSouthEastMove(moves,col,row);
        addSouthWestMove(moves,col,row);
        return String.join(", ", moves);
    }

    private void addNorthMove(List<String> moves, char col, int row) {

        while(row>=1 && row <ChessBoard.noOfRows){
            row++;
            String position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addSouthMove(List<String> moves, char col, int row) {
        while(row>1 && row <=ChessBoard.noOfRows){
            row--;
            String position = String.valueOf( col) + (row);
            moves.add(position);
        }
    }

    private void addEastMove(List<String> moves, char col, int row) {
        while( col>=ChessBoard.startColumn && col < ChessBoard.endColumn){
            col++;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addWestMove(List<String> moves, char col, int row) {
        while( col>ChessBoard.startColumn && col <= ChessBoard.endColumn){
            col--;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addNorthEastMove(List<String> moves, char col, int row) {

        while(row>=1 && row <ChessBoard.noOfRows && col>=ChessBoard.startColumn && col < ChessBoard.endColumn){
            row++;col++;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addNorthWestMove(List<String> moves, char col, int row) {
        while(row>=1 && row <ChessBoard.noOfRows && col>ChessBoard.startColumn && col <= ChessBoard.endColumn){
            row++;col--;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addSouthEastMove(List<String> moves, char col, int row) {
        while(row>1 && row <=ChessBoard.noOfRows && col>=ChessBoard.startColumn && col < ChessBoard.endColumn){
            row--;col++;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

    private void addSouthWestMove(List<String> moves, char col, int row) {
        while(row>1 && row <=ChessBoard.noOfRows && col>ChessBoard.startColumn && col <= ChessBoard.endColumn){
            row--;col--;
            position = String.valueOf( col) + (row);
            moves.add(position);
        }

    }

}
