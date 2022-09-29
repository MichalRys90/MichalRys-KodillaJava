package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import static com.kodilla.sudoku.game.Move.scanner;

public class GameLevel {

    public boolean easyGame() throws CloneNotSupportedException {
    MoveLevel moveLevel = new MoveLevel();
    SudokuBoard sudokuBoard = new SudokuBoard();
    sudokuBoard.createBoard();
    SudokuGame sudokuGame = new SudokuGame();
    sudokuBoard = sudokuGame.easyLevel();
    moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            easyGame();
            return true;
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
            return true;
        }
        return true;
    }

    public boolean normalGame() throws CloneNotSupportedException {
        MoveLevel moveLevel = new MoveLevel();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame();
        sudokuBoard = sudokuGame.normalLevel();
        moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            normalGame();
            return true;
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
            return true;
        }
        return true;
    }

    public boolean hardGame() throws CloneNotSupportedException {
        MoveLevel moveLevel = new MoveLevel();
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        SudokuGame sudokuGame = new SudokuGame();
        sudokuBoard = sudokuGame.hardLevel();
        moveLevel.game(sudokuBoard);
        boolean check = sudokuGame.checkSolve(sudokuBoard);
        if (check) {
            System.out.println(sudokuBoard);
        }
        System.out.println("Do you wanna play again? \"y = yes\"");
        String s = scanner.nextLine();
        if (s.equals("y")) {
            hardGame();
            return true;
        }
        System.out.println("Do you wanna back to menu? \"y = yes");
        s = scanner.nextLine();
        if (s.equals("y")) {
            MainMenu menu = new MainMenu();
            menu.play();
            return true;
        }
        return true;
    }
}
