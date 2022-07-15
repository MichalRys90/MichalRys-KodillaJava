package com.kodilla.rps.moves;

import java.util.Random;

import static com.kodilla.rps.names.Lizard.lizard;
import static com.kodilla.rps.names.Paper.paper;
import static com.kodilla.rps.names.Rock.rock;
import static com.kodilla.rps.names.Scissors.scissors;
import static com.kodilla.rps.names.Spock.spock;

public class ComputerMovesToSpock {

    private String computerMoveToSpock;
    Random random = new Random();


    public String computerTurnSpock() {
        int n = random.nextInt(5);
        if (n == 0) {
            computerMoveToSpock = rock;
        } else if (n == 1) {
            computerMoveToSpock = paper;
        } else if (n == 2) {
            computerMoveToSpock = scissors;
        } else if (n == 3) {
            computerMoveToSpock = spock;
        } else if (n == 4) {
            computerMoveToSpock = lizard;
        }
        return computerMoveToSpock;
    }
}
