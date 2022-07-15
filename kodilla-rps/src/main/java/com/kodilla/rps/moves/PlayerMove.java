package com.kodilla.rps.moves;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.names.Paper.paper;
import static com.kodilla.rps.names.Rock.rock;
import static com.kodilla.rps.names.Scissors.scissors;

public class PlayerMove {
    private String playerMove;
    Scanner scanner = new Scanner(System.in);


    public String playerTurn() {
        int n = scanner.next().charAt(0);;
        if (n == '1') {
            playerMove = rock;
        } else if (n == '2') {
            playerMove= paper;
        } else if (n == '3') {
            playerMove = scissors;
        } else if (n == 'n') {
            playerMove = "n";
        } else if (n == 'x') {
            playerMove = "x";
        } else {
            playerMove = "Bad choice";
        }
        return playerMove;
    }
}
