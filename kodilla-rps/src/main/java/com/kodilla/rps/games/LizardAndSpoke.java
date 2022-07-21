package com.kodilla.rps.games;

import com.kodilla.rps.exceptions.BadChoiceException;
import com.kodilla.rps.MainManu;
import com.kodilla.rps.moves.ComputerMovesToSpock;
import com.kodilla.rps.moves.PlayerMoveToSpock;
import com.kodilla.rps.exceptions.HowManyGames;

import java.util.Scanner;

import static com.kodilla.rps.names.Strings.*;
import static com.kodilla.rps.names.PlayerName.name;

public class LizardAndSpoke {
    public void gameSpock() throws BadChoiceException {
        PlayerMoveToSpock playerMoveToSpock = new PlayerMoveToSpock();
        ComputerMovesToSpock computerMovesToSpock = new ComputerMovesToSpock();
        HowManyGames howManyGames1 = new HowManyGames();
        MainManu mainManu = new MainManu();
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        int playerScore;
        int computerScore;
        System.out.println(gameRulesForSpock);
        while (game) {
            System.out.println(howManyGames);
            int howManyGames = howManyGames1.howManyGames();
            boolean game1 = true;
            computerScore = 0;
            playerScore = 0;
            while ((game1) && (computerScore < howManyGames) && (playerScore < howManyGames)) {
                System.out.println("The current result is: \n" + name + " " + playerScore + " Computer " + computerScore);
                System.out.println("Your move");
                String userMove = playerMoveToSpock.spockPlayerTurn();
                String compMove = computerMovesToSpock.computerTurnSpock();
                if (userMove == "x") {
                    System.out.println("Are you sure you want to quit the game? y = yes");
                    int y = scanner.next().charAt(0);
                    if (y == 'y') {
                        game1 = false;
                        game = false;
                        mainManu.interfejs();
                    }
                } else if (userMove == "n") {
                    System.out.println("Are you sure you want to start the game over? y = yes");
                    int y = scanner.next().charAt(0);
                    if (y == 'y') {
                        game1 = false;
                    }
                }
                if (((userMove.equals("Rock")) && (compMove.equals("Paper"))) ||
                        ((userMove.equals("Paper")) && (compMove.equals("Scissors"))) ||
                        ((userMove.equals("Scissors")) && (compMove.equals("Rock"))) ||
                        ((userMove.equals("Lizard")) && (compMove.equals("Rock"))) ||
                        ((userMove.equals("Spock")) && (compMove.equals("Lizard"))) ||
                        ((userMove.equals("Scissors")) && (compMove.equals("Spock"))) ||
                        ((userMove.equals("Lizard")) && (compMove.equals("Scissors"))) ||
                        ((userMove.equals("Paper")) && (compMove.equals("Lizard"))) ||
                        ((userMove.equals("Spock")) && (compMove.equals("Paper"))) ||
                        ((userMove.equals("Rock")) && (compMove.equals("Spock")))) {
                    System.out.println("You lose! Computer chose " + compMove);
                    computerScore++;
                } else if (((userMove.equals("Rock")) && (compMove.equals("Scissors"))) ||
                        ((userMove.equals("Paper")) && (compMove.equals("Rock"))) ||
                        ((userMove.equals("Scissors")) && (compMove.equals("Paper"))) ||
                        ((userMove.equals("Rock")) && (compMove.equals("Lizard"))) ||
                        ((userMove.equals("Lizard")) && (compMove.equals("Spock"))) ||
                        ((userMove.equals("Spock")) && (compMove.equals("Scissors"))) ||
                        ((userMove.equals("Scissors")) && (compMove.equals("Lizard"))) ||
                        ((userMove.equals("Lizard")) && (compMove.equals("Paper"))) ||
                        ((userMove.equals("Paper")) && (compMove.equals("Spock"))) ||
                        ((userMove.equals("Spock")) && (compMove.equals("Rock")))) {
                    System.out.println("You won! Computer chose " + compMove);
                    playerScore++;
                } else {
                    System.out.println("Draw you chose " + userMove + " Computer chose " + compMove);
                }
                if (computerScore == howManyGames) {
                    System.out.println("Game over COMPUTER WON\nThe current result is: \n" +
                            name + " " + playerScore + " Computer " + computerScore +
                            "\nDo you wanna play again? Yes(Press any key), No(n)");
                    int n = scanner.next().charAt(0);
                    if (n == 'n') {
                        game = false;
                    }
                }
                if (playerScore == howManyGames) {
                    System.out.println("Game over YOU WON\nThe current result is: \n"
                            + name + " " + playerScore + " Computer " + computerScore +
                            "\nDo you wanna play again? Yes(Press any key), No(n)");
                    int m = scanner.next().charAt(0);
                    if (m == 'n') {

                        game = false;
                    }
                }
            }
        }
    }
}
