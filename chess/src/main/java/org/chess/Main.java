package org.chess;

import org.chess.piece.ChessPiece;
import org.chess.exception.ChessException;
import org.chess.impl.King;
import org.chess.impl.Pawn;
import org.chess.impl.Queen;
import org.chess.validations.Validate;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ChessException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of chess piece and its position (e.g., Pawn, G1): ");
        String input = scanner.nextLine();
        String[] parts = input.split(", ");
        String type= parts[0];
        String position = parts[1];

        Validate.validatePosition(position);
        ChessPiece piece = switch (type) {
            case "Pawn" : yield new Pawn(type,position);
            case "King" : yield new King(type,position);
            case "Queen" : yield  new Queen(type,position);
            case "Rook", "Bishop", "Horse": throw new ChessException("Movement is not available for "+type);
            default:
                throw new ChessException("Unexpected piece : " + type);
        };


        System.out.println(piece.move());
    }
}