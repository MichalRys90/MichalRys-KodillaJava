package com.kodilla.rps.games;

import com.kodilla.rps.moves.ComputerMove;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Strings.gameRules;
import static com.kodilla.rps.Strings.howManyGames;
import static com.kodilla.rps.names.PlayerName.name;

public class EasyGame {
    public void easyGame() {
        ComputerMove computerMove = new ComputerMove();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        int playerScore;
        int computerScore;
        System.out.println(gameRules);
        while (game) {
            System.out.println(howManyGames);
            int howManyGames = scanner.nextInt();
            boolean game1 = true;
            computerScore = 0;
            playerScore = 0;
            while ((game1) && (computerScore < howManyGames) && (playerScore < howManyGames)) {
                System.out.println("The current result is: \n" + name + " " + playerScore + " Computer " + computerScore);
                int easy = random.nextInt(2);
                if (easy == 0) {
                    System.out.println("Your move");
                    int i = scanner.next().charAt(0);
                    String compMove = computerMove.computerTurn();
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
                } else {
                    System.out.println("Your move");
                    int i = scanner.next().charAt(0);
                    if (i == '1') {
                        System.out.println("You won! Computer chose scissors");
                        playerScore++;
                    } else if (i == '2') {
                        System.out.println("You won! Computer chose rock");
                        playerScore++;
                    } else if (i == '3') {
                        System.out.println("You won! Computer chose paper");
                        playerScore++;
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
}
