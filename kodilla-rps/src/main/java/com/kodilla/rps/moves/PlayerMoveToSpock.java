package com.kodilla.rps.moves;

import java.util.Scanner;

import static com.kodilla.rps.names.Paper.paper;
import static com.kodilla.rps.names.Rock.rock;
import static com.kodilla.rps.names.Scissors.scissors;
import static com.kodilla.rps.names.Spock.spock;
import static com.kodilla.rps.names.Lizard.lizard;

public class PlayerMoveToSpock {
    private String playerMoveToSpock;
    Scanner scanner = new Scanner(System.in);


    public String spockPlayerTurn() {
        int n = scanner.next().charAt(0);
        if (n == '1') {
            playerMoveToSpock = rock;
        } else if (n == '2') {
            playerMoveToSpock = paper;
        } else if (n == '3') {
            playerMoveToSpock = scissors;
        }else if (n == '4') {
            playerMoveToSpock = spock;
        }else if (n == '5') {
            playerMoveToSpock = lizard;
        }else if (n == 'n') {
            playerMoveToSpock = "n";
        } else if (n == 'x') {
            playerMoveToSpock = "x";
        } else {
            playerMoveToSpock = "Bad choice";
        }
        return playerMoveToSpock;
    }
}
