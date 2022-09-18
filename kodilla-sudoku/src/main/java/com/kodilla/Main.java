package com.kodilla;

import com.kodilla.sudoku.game.Game;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        boolean gameFinished = false;
        while (!gameFinished) {
            Game game = new Game();
            gameFinished = game.play();
        }
    }
}