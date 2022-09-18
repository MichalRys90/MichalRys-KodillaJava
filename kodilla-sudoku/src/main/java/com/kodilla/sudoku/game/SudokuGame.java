package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuElement;

import java.util.Random;

public class SudokuGame {

    private final SudokuBoard sudokuBoard;

    public SudokuGame(SudokuBoard board) {
        this.sudokuBoard = board;
    }

    public boolean checkSolve(SudokuBoard board) {
        if (!resolveSudoku(board)) {
            System.out.println("Impossible to solve");
            return false;
        }
        return true;
    }

    public boolean resolveSudoku(SudokuBoard board) {
        for (int k = 0; k < 9; k++) {
            for (int j = 0; j < 9; j++) {
                if (board.getRows().get(k).getCells().get(j).getValue() == -1) {
                    for (int i = 1; i <= 9; i++) {
                        if (isPossiblePlace(k, j, i)) {
                            board.getRows().get(k).getCells().get(j).setValue(i);
                            if (resolveSudoku(board)) {
                                return true;
                            } else {
                                board.getRows().get(k).getCells().get(j).setValue(SudokuElement.EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isNumberInColumn(int y, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard.getRows().get(i).getCells().get(y).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInRow(int x, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard.getRows().get(x).getCells().get(i).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInBox(int x, int y, int number) {
        int boxRow = x - x % 3;
        int boxColumn = y - y % 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxColumn; j < boxColumn + 3; j++) {
                if (sudokuBoard.getRows().get(i).getCells().get(j).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPossiblePlace(int x, int y, int number) {
        return !isNumberInBox(x, y, number) && !isNumberInColumn(y, number) && !isNumberInRow(x, number);
    }

    public void easyLevel(SudokuBoard board) {
        Random random = new Random();
        int counter = 0;

        while (counter < 60) {
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(one, two, three)) {
                board.getRows().get(one).getCells().get(two).setValue(three);
                counter++;
            }
        }
    }

    public void normalLevel(SudokuBoard board) {
        Random random = new Random();
        int counter = 0;

        while (counter < 40) {
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(one, two, three)) {
                board.getRows().get(one).getCells().get(two).setValue(three);
                counter++;
            }
        }
    }

    public void hardLevel(SudokuBoard board) {
        Random random = new Random();
        int counter = 0;

        while (counter < 20) {
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(one, two, three)) {
                board.getRows().get(one).getCells().get(two).setValue(three);
                counter++;
            }
        }
    }
}
