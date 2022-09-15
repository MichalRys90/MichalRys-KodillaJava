package com.kodilla;

import com.kodilla.sudoku.SudokuGame;

public class Main {
    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}