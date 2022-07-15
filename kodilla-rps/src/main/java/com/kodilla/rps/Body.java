package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Body {
    public void startGame() {
        Random random = new Random();
        System.out.println("Give your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " welcome to the game rock paper scissors" +
                "\nhow many winns would you like to play?");
        int howManyGame = scanner.nextInt();
        System.out.println("Game rules \nchoose 1 - Rock\nchoose 2 - paper\nchoose 3 - scissors" +
                "\nchoose x - end game\nchoose n - start over");
        boolean game = true;
        int playerScore = 0;
        int computerScore = 0;
        while ((game) && (computerScore < howManyGame) && (playerScore < howManyGame)) {
            System.out.println("The current result is: \n" + name + " " + playerScore + " Computer " + computerScore);
            int i = scanner.next().charAt(0);
            int n = random.nextInt(3) + 1;
            if ((i == '1') && (n == 1)) {
                System.out.println("Draw you and the computer chose the rock!");
            } else if ((i == '1') && (n == 2)) {
                System.out.println("You lose! Computer chose paper");
                computerScore++;
            } else if ((i == '1') && (n == 3)) {
                System.out.println("You won! Computer chose scissors");
                playerScore++;
            } else if ((i == '2') && (n == 1)) {
                System.out.println("You won! Computer chose rock");
                playerScore++;
            } else if ((i == '2') && (n == 2)) {
                System.out.println("Draw you and the computer chose the paper!");
            } else if ((i) == '2' && (n == 3)) {
                System.out.println("You lose! Computer chose scissors");
                computerScore++;
            } else if ((i) == '3' && (n == 1)) {
                System.out.println("You lose! Computer chose rock");
                computerScore++;
            } else if ((i) == '3' && (n == 2)) {
                System.out.println("You won! Computer chose scissors");
                playerScore++;
            } else if ((i) == '3' && (n == 3)) {
                System.out.println("Draw you and the computer chose the scissors!");
            }
        }
        if (computerScore > playerScore) {
            System.out.println("Game over \nThe current result is: \n" +
                    name + " " + playerScore + " Computer " + computerScore);
        } else {
            System.out.println("Game over \nThe current result is: \n"
                    + name + " " + playerScore + " Computer " + computerScore);
        }
        //char choose = scanner.next().charAt(0);
    }
}
