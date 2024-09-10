package org.chess.impl;

import org.chess.piece.ChessPiece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KingTest {

    @Test
    public void testPossibleKingMovesAt_CenterOfBoard(){
        ChessPiece p = new King("King", "D5");
        String position = p.move();
        String expectedResult = "C4, C5, C6, D4, D6, E4, E5, E6";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleKingMovesAt_FirstRowFirstColumnOfBoard(){
        ChessPiece p = new King("King", "A1");
        String position = p.move();
        String expectedResult = "A2, B1, B2";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleKingMovesAt_FirstRowCenterColumnOfBoard(){
        ChessPiece p = new King("King", "D1");
        String position = p.move();
        String expectedResult = "C1, C2, D2, E1, E2";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleKingMovesAt_LastRowLastColumnOfBoard(){
        ChessPiece p = new King("King", "H8");
        String position = p.move();
        String expectedResult = "G7, G8, H7";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleKingMovesAt_LastColumnCenterRowOfBoard(){
        ChessPiece p = new King("King", "H4");
        String position = p.move();
        String expectedResult = "G3, G4, G5, H3, H5";
        Assertions.assertEquals(expectedResult,position);
    }


}
