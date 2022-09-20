package com.kodilla.sudoku.game;

import java.util.Scanner;

public class MainMenu {
    public void play() throws CloneNotSupportedException {

        Scanner scanner = new Scanner(System.in);
        GameLevel gameLevel = new GameLevel();
        Game game = new Game();
        boolean gameFinished = false;
        System.out.println("Welcome in Sudoku");
        System.out.println("Choose game");
        System.out.println("Press \"1\" You will create your own sudoku " +
                "and you will be able to check if it can be solved!");
        System.out.println("Press \"2\" easy game with 60 entered numbers");
        System.out.println("Press \"3\" normal game with 40 entered numbers");
        System.out.println("Press \"4\" hard game with 20 entered numbers");
        System.out.println("Press \"5\" exit");
        String s = scanner.nextLine();

        switch (s) {
            case "1" -> {
                while (!gameFinished) {
                    gameFinished = game.play();
                }
            }
            case "2" -> {
                while (!gameFinished) {
                    gameFinished = gameLevel.easyGame();
                }
            }
            case "3" -> {
                while (!gameFinished) {
                    gameFinished = gameLevel.normalGame();
                }
            }
            case "4" -> {
                while (!gameFinished) {
                    gameFinished = gameLevel.hardGame();
                }
            }
            case "5" -> System.out.println("Good bye");
            default -> System.out.println("Not a defined operation, Exit");
        }
    }
}
