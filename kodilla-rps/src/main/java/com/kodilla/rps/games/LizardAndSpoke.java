package com.kodilla.rps.games;

import com.kodilla.rps.moves.ComputerMovesToSpock;

import java.util.Scanner;

import static com.kodilla.rps.Strings.*;
import static com.kodilla.rps.names.PlayerName.name;

public class LizardAndSpoke {
    public void gameSpock() {
        ComputerMovesToSpock computerMovesToSpock = new ComputerMovesToSpock();
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        int playerScore;
        int computerScore;
        System.out.println(gameRulesForSpock);
        while (game) {
            System.out.println(howManyGames);
            int howManyGames = scanner.nextInt();
            boolean game1 = true;
            computerScore = 0;
            playerScore = 0;
            while ((game1) && (computerScore < howManyGames) && (playerScore < howManyGames)) {
                System.out.println("The current result is: \n" + name + " " + playerScore + " Computer " + computerScore);
                System.out.println("Your move");
                int i = scanner.next().charAt(0);
                String compMove = computerMovesToSpock.computerTurnSpock();
                if ((i == '1') && (compMove.equals("Rock"))) {
                    System.out.println("Draw you and the computer chose the rock!");
                } else if ((i == '1') && (compMove.equals("Paper"))) {
                    System.out.println("You lose! Computer chose paper");
                    computerScore++;
                } else if ((i == '1') && (compMove.equals("Scissors"))) {
                    System.out.println("You won! Computer chose scissors");
                    playerScore++;
                } else if ((i == '2') && (compMove.equals("Rock"))) {
                    System.out.println("You won! Computer chose rock");
                    playerScore++;
                } else if ((i == '2') && (compMove.equals("Paper"))) {
                    System.out.println("Draw you and the computer chose the paper!");
                } else if ((i) == '2' && (compMove.equals("Scissors"))) {
                    System.out.println("You lose! Computer chose scissors");
                    computerScore++;
                } else if ((i) == '3' && (compMove.equals("Rock"))) {
                    System.out.println("You lose! Computer chose rock");
                    computerScore++;
                } else if ((i) == '3' && (compMove.equals("Paper"))) {
                    System.out.println("You won! Computer chose paper");
                    playerScore++;
                } else if ((i) == '3' && (compMove.equals("Scissors"))) {
                    System.out.println("Draw you and the computer chose the scissors!");
                } else if ((i) == '1' && (compMove.equals("Lizard"))) {
                    System.out.println("You won! Computer chose Lizard");
                    playerScore++;
                } else if ((i) == '5' && (compMove.equals("Rock"))) {
                    System.out.println("You lose! Computer chose Rock");
                    computerScore++;
                } else if ((i) == '5' && (compMove.equals("Spock"))) {
                    System.out.println("You won! Computer chose Spock");
                    playerScore++;
                } else if ((i) == '4' && (compMove.equals("Lizard"))) {
                    System.out.println("You lose! Computer chose Lizard");
                    computerScore++;
                } else if ((i) == '4' && (compMove.equals("Scissors"))) {
                    System.out.println("You won! Computer chose Scissors");
                    playerScore++;
                } else if ((i) == '3' && (compMove.equals("Spock"))) {
                    System.out.println("You lose! Computer chose Spock");
                    computerScore++;
                } else if ((i) == '3' && (compMove.equals("Lizard"))) {
                    System.out.println("You won! Computer chose Lizard");
                    playerScore++;
                } else if ((i) == '5' && (compMove.equals("Scissors"))) {
                    System.out.println("You lose! Computer chose Scissors");
                    computerScore++;
                } else if ((i) == '5' && (compMove.equals("Paper"))) {
                    System.out.println("You won! Computer chose Paper");
                    playerScore++;
                } else if ((i) == '2' && (compMove.equals("Lizard"))) {
                    System.out.println("You lose! Computer chose Lizard");
                    computerScore++;
                } else if ((i) == '2' && (compMove.equals("Spock"))) {
                    System.out.println("You won! Computer chose Spock");
                    playerScore++;
                } else if ((i) == '4' && (compMove.equals("Paper"))) {
                    System.out.println("You lose! Computer chose Paper");
                    computerScore++;
                } else if ((i) == '4' && (compMove.equals("Rock"))) {
                    System.out.println("You won! Computer chose Rock");
                    playerScore++;
                } else if ((i) == '1' && (compMove.equals("Spock"))) {
                    System.out.println("You won! Computer chose Spock");
                    computerScore++;
                } else if (i == 'x') {
                    System.out.println("Are you sure you want to quit the game? y = yes");
                    int y = scanner.next().charAt(0);
                    if (y == 'y') {
                        game1 = false;
                        game = false;
                    }
                } else if (i == 'n') {
                    System.out.println("Are you sure you want to start the game over? y = yes");
                    int y = scanner.next().charAt(0);
                    if (y == 'y') {
                        game1 = false;
                    }
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
