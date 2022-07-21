package com.kodilla.rps.moves;

import com.kodilla.rps.exceptions.BadChoiceException;

import java.util.Scanner;

import static com.kodilla.rps.names.Paper.paper;
import static com.kodilla.rps.names.Rock.rock;
import static com.kodilla.rps.names.Scissors.scissors;

public class PlayerMove {
    private String playerMove;
    Scanner scanner = new Scanner(System.in);


    public String playerTurns() throws BadChoiceException {
        int n = scanner.next().charAt(0);
        if (n == '1') {
            playerMove = rock;
        } else if (n == '2') {
            playerMove = paper;
        } else if (n == '3') {
            playerMove = scissors;
        } else if (n == 'n') {
            playerMove = "n";
        } else if (n == 'x') {
            playerMove = "x";
        } else {
            throw new BadChoiceException("Bad choice");
        }
        return playerMove;
    }

    public String playerTurn() throws BadChoiceException {
        PlayerMove playerMove1 = new PlayerMove();
        try {
            return playerMove1.playerTurns();
        } catch (BadChoiceException e) {
            System.out.println(e);
        }
        return playerTurn();
    }
}
