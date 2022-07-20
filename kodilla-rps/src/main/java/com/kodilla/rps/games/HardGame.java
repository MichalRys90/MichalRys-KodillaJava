package com.kodilla.rps.games;

import com.kodilla.rps.moves.ComputerMove;
import com.kodilla.rps.moves.PlayerMove;
import com.kodilla.rps.names.HowManyGames;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Strings.gameRules;
import static com.kodilla.rps.Strings.howManyGames;
import static com.kodilla.rps.names.PlayerName.name;

public class HardGame {
    public void hardGame() {
        PlayerMove playerMove = new PlayerMove();
        HowManyGames howManyGames1 = new HowManyGames();
        ComputerMove computerMove = new ComputerMove();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        int playerScore;
        int computerScore;
        System.out.println(gameRules);
        while (game) {
            System.out.println(howManyGames);
            int howManyGames = howManyGames1.howManyGames();
            boolean game1 = true;
            computerScore = 0;
            playerScore = 0;
            while ((game1) && (computerScore < howManyGames) && (playerScore < howManyGames)) {
                System.out.println("The current result is: \n" + name + " " + playerScore + " Computer " + computerScore);
                int easy = random.nextInt(2);
                if (easy == 0) {
                    System.out.println("Your move");
                    String userMove = playerMove.playerTurn();
                    String compMove = computerMove.computerTurn();
                    if (userMove == "x") {
                        System.out.println("Are you sure you want to quit the game? y = yes");
                        int y = scanner.next().charAt(0);
                        if (y == 'y') {
                            game1 = false;
                            game = false;
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
                            ((userMove.equals("Scissors")) && (compMove.equals("Rock")))) {
                        System.out.println("You lose! Computer chose " + compMove);
                        computerScore++;
                    } else if (((userMove.equals("Rock")) && (compMove.equals("Scissors"))) ||
                            ((userMove.equals("Paper")) && (compMove.equals("Rock"))) ||
                            ((userMove.equals("Scissors")) && (compMove.equals("Paper")))) {
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
                } else {
                    System.out.println("Your move");
                    int i = scanner.next().charAt(0);
                    if (i == '1') {
                        System.out.println("You lose! Computer chose paper");
                        computerScore++;
                    } else if (i == '2') {
                        System.out.println("You lose! Computer chose scissors");
                        computerScore++;
                    } else if (i == '3') {
                        System.out.println("You lose! Computer chose rock");
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
                }
            }
        }
    }
}
