package org.chess.validations;

import org.chess.exception.ChessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateTest {
    @Test
    public void validatePositionIsCorrect_ReturnsTrue() throws ChessException {
            Assertions.assertTrue(Validate.validatePosition("G1"));
    }

    @Test
    public void validatePositionIsInCorrect_throwsException()  {
        Assertions.assertThrows(ChessException.class, ()->Validate.validatePosition("I1"));
    }
}
