package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Scanner;


public class Game {

    public boolean play() throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        Move move = new Move();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame();
        move.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            play();
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
        }
        return true;
    }
}
