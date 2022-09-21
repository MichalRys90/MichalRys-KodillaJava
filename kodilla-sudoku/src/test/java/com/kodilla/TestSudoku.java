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

//    @Test
//    void testEasy() throws CloneNotSupportedException {
//        //Given
//        SudokuBoard sudokuBoard = new SudokuBoard();
//        sudokuBoard.createBoard();
//
//        //When
//        SudokuGame sudokuGame = new SudokuGame();
//        sudokuGame.easyLevel(sudokuBoard);
//
//        //Then
//        System.out.println(sudokuBoard);
//    }
//
//    @Test
//    void testNormal() throws CloneNotSupportedException {
//        //Given
//        SudokuBoard sudokuBoard = new SudokuBoard();
//        sudokuBoard.createBoard();
//
//        //When
//        SudokuGame sudokuGame = new SudokuGame();
//        sudokuGame.normalLevel(sudokuBoard);
//
//        //Then
//        System.out.println(sudokuBoard);
//    }
//
//    @Test
//    void testHard() throws CloneNotSupportedException {
//        //Given
//        SudokuBoard sudokuBoard = new SudokuBoard();
//        sudokuBoard.createBoard();
//
//        //When
//        SudokuGame sudokuGame = new SudokuGame();
//        sudokuGame.hardLevel(sudokuBoard);
//
//        //Then
//        System.out.println(sudokuBoard);
//        sudokuGame.resolveSudoku(sudokuBoard);
//        System.out.println(sudokuBoard);
//    }
}
