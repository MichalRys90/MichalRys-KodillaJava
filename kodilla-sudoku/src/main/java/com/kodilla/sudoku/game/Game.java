package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Scanner;

public class Game {

    public boolean play() throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        Move move = new Move();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame(sudokuBoard);
        move.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            sudokuGame.resolveSudoku(sudokuBoard);
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            play();
        }
        return true;
    }
}
