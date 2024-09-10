package org.chess.impl;

import org.chess.piece.ChessPiece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueenTest {

    @Test
    public void testPossibleQueenMovesAt_CenterOfBoard(){
        ChessPiece p = new Queen("Queen", "E4");
        String position = p.move();
        String expectedResult = "E5, E6, E7, E8, E3, E2, E1, F4, G4, H4, D4, C4, B4, A4, F5, G6, H7, D5, C6, B7, A8, F3, G2, H1, D3, C2, B1";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleQueenMovesAt_FirstRowFirstColumnOfBoard(){
        ChessPiece p = new Queen("Queen", "A1");
        String position = p.move();
        String expectedResult = "A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1, B2, C3, D4, E5, F6, G7, H8";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleQueenMovesAt_FirstRowCenterColumnOfBoard(){
        ChessPiece p = new Queen("Queen", "D1");
        String position = p.move();
        String expectedResult = "D2, D3, D4, D5, D6, D7, D8, E1, F1, G1, H1, C1, B1, A1, E2, F3, G4, H5, C2, B3, A4";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleQueenMovesAt_LastRowLastColumnOfBoard(){
        ChessPiece p = new Queen("Queen", "H8");
        String position = p.move();
        String expectedResult = "H7, H6, H5, H4, H3, H2, H1, G8, F8, E8, D8, C8, B8, A8, G7, F6, E5, D4, C3, B2, A1";
        Assertions.assertEquals(expectedResult,position);
    }

    @Test
    public void testPossibleQueenMovesAt_LastColumnCenterRowOfBoard(){
        ChessPiece p = new Queen("Queen", "H4");
        String position = p.move();
        String expectedResult = "H5, H6, H7, H8, H3, H2, H1, G4, F4, E4, D4, C4, B4, A4, G5, F6, E7, D8, G3, F2, E1";
        Assertions.assertEquals(expectedResult,position);
    }
}
