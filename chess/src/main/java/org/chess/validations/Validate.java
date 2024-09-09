package org.chess.validations;

import org.chess.exception.ChessException;

public class Validate {
    public static boolean validatePosition(String position) throws ChessException {
        char col = position.charAt(0);
        int row = Integer.parseInt(position.substring(1));
        if(col<'A' || col >'H' || row <1 || row >8) {
            throw new ChessException("Position should lie in the range of A1 to H8");
        }
        return true;
    }
}
