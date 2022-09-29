package com.kodilla;


import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.game.SudokuGame;
import org.junit.jupiter.api.Test;

public class TestSudoku {

    @Test
    void testForClone() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        System.out.println(sudokuBoard);
        SudokuBoard clonedBoard = new SudokuBoard();

        //When
        try {
            clonedBoard = sudokuBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(clonedBoard);

        //Then
        sudokuBoard.addElement(1, 2, 5);
        System.out.println(sudokuBoard);
        System.out.println(clonedBoard);
    }

    @Test
    void testSolver() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();

        //When
        sudokuBoard.addElement(1, 2, 3);
        sudokuBoard.addElement(1, 4, 7);
        sudokuBoard.addElement(2, 2, 9);
        SudokuGame sudokuGame = new SudokuGame();

        //Then
        sudokuGame.resolveSudoku(sudokuBoard);
        System.out.println(sudokuBoard);
    }

    @Test
    void testEasy() {
        //Given
        SudokuGame sudokuGame = new SudokuGame();

        //When
        SudokuBoard sudokuBoard = sudokuGame.easyLevel();

        //Then
        System.out.println(sudokuBoard);
    }

    @Test
    void testNormal() {
        //Given
        SudokuGame sudokuGame = new SudokuGame();

        //When
        SudokuBoard sudokuBoard = sudokuGame.normalLevel();

        //Then
        System.out.println(sudokuBoard);
    }

    @Test
    void testHard() {
        //Given
        SudokuGame sudokuGame = new SudokuGame();


        //When
        SudokuBoard sudokuBoard = sudokuGame.hardLevel();

        //Then
        System.out.println(sudokuBoard);
        sudokuGame.resolveSudoku(sudokuBoard);
        System.out.println(sudokuBoard);
    }
}
