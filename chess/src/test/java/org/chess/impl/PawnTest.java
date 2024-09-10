package org.chess.impl;

import org.chess.piece.ChessPiece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PawnTest {
    @Test
    public void testPositionOfPawnAt_CenterOfBoard(){
        ChessPiece p = new Pawn("Pawn", "G1");
        String position = p.move();
        Assertions.assertEquals("G2",position);

    }

    @Test
    public void testPositionOfPawnAt_FirstRowFirstColumn(){
        ChessPiece p = new Pawn("Pawn", "A1");
        String position = p.move();
        Assertions.assertEquals("A2",position);
    }

    @Test
    public void testPositionOfPawnAt_LastRowLastColumn(){
        ChessPiece p = new Pawn("Pawn", "H8");
        String position = p.move();
        Assertions.assertEquals("H8",position);
    }

    @Test
    public void testPositionOfPawnAt_FirstRowCentreColumn(){
        ChessPiece p = new Pawn("Pawn", "D1");
        String position = p.move();
        Assertions.assertEquals("D2",position);
    }

    @Test
    public void testPositionOfPawnAt_LastRowCenterColumn(){
        ChessPiece p = new Pawn("Pawn", "D8");
        String position = p.move();
        Assertions.assertEquals("D8",position);
    }

    @Test
    public void testPositionOfPawnAt_FirstColumnCentreRow(){
        ChessPiece p = new Pawn("Pawn", "A4");
        String position = p.move();
        Assertions.assertEquals("A5",position);
    }

    @Test
    public void testPositionOfPawnAt_LastColumnCenterRow(){
        ChessPiece p = new Pawn("Pawn", "H5");
        String position = p.move();
        Assertions.assertEquals("H6",position);
    }


}
