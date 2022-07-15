package com.kodilla.rps;

import com.kodilla.rps.moves.ComputerMove;
import com.kodilla.rps.moves.PlayerMove;


import java.util.Random;
import java.util.Scanner;
// This class is only FOR TEST!!!!!!
// This class is only FOR TEST!!!!!!
// This class is only FOR TEST!!!!!!

public class Body {
    public void startGame() {
        ComputerMove computerMove = new ComputerMove();
        PlayerMove playerMove = new PlayerMove();
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
            String userMove = playerMove.playerTurn();
            String compMove = computerMove.computerTurn();
            if (((userMove.equals("Rock")) && (compMove.equals("Paper"))) ||
                    ((userMove.equals("Paper")) && (compMove.equals("Scissors"))) ||
                    ((userMove.equals("Scissors")) && (compMove.equals("Rock")))) {
                System.out.println("You lose! Computer chose paper");
                computerScore++;
            } else if (((userMove.equals("Rock")) && (compMove.equals("Scissors"))) ||
                    ((userMove.equals("Paper")) && (compMove.equals("Rock"))) ||
                    ((userMove.equals("Scissors")) && (compMove.equals("Paper")))) {
                System.out.println("You won! Computer chose " + compMove);
                playerScore++;
            } else {
                System.out.println("Draw you chose " + userMove + " Computer chose " + compMove);
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
