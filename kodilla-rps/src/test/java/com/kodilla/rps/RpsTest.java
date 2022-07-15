package com.kodilla.rps;

import com.kodilla.rps.moves.ComputerMove;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RpsTest {
    @Test
    void TestMoves() {
        //Given
        ComputerMove computerMove = new ComputerMove();

        //When
        String result = computerMove.computerTurn();

        //Then
        assertEquals("Rock", result);
    }

}
