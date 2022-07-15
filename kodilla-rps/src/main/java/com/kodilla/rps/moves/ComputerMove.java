package com.kodilla.rps.moves;

import java.util.Random;

import static com.kodilla.rps.names.Rock.rock;
import static com.kodilla.rps.names.Paper.paper;
import static com.kodilla.rps.names.Scissors.scissors;

public class ComputerMove {
    private String computerMove;
    Random random = new Random();


    public String computerTurn() {
        int n = random.nextInt(3) +1;
        if (n == 1) {
            computerMove = rock;
        } else if (n == 2) {
            computerMove = paper;
        } else if (n == 3) {
            computerMove = scissors;
        }
        return computerMove;
    }
}
