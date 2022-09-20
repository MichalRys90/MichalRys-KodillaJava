package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import static com.kodilla.sudoku.game.Move.scanner;

public class GameLevel {

    public boolean easyGame() throws CloneNotSupportedException {
    MoveLevel moveLevel = new MoveLevel();
    SudokuBoard sudokuBoard = new SudokuBoard();
    sudokuBoard.createBoard();
    SudokuGame sudokuGame = new SudokuGame();
    sudokuGame.easyLevel(sudokuBoard);
    moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            easyGame();
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
        }
        return true;
    }

    public boolean normalGame() throws CloneNotSupportedException {
        MoveLevel moveLevel = new MoveLevel();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.normalLevel(sudokuBoard);
        moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            normalGame();
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
        }
        return true;
    }

    public boolean hardGame() throws CloneNotSupportedException {
        MoveLevel moveLevel = new MoveLevel();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.hardLevel(sudokuBoard);
        moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            hardGame();
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
