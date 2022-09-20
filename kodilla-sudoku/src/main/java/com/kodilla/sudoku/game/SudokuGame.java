package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuElement;

import java.util.Random;

public class SudokuGame {

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
                        if (isPossiblePlace(board, k, j, i)) {
                            board.addElement(k + 1, j + 1, i);
                            if (resolveSudoku(board)) {
                                return true;
                            } else {
                                board.addElement(k + 1, j + 1, SudokuElement.EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isNumberInColumn(SudokuBoard board, int y, int number) {
        for (int i = 0; i < 9; i++) {
            if (board.getRows().get(i).getCells().get(y).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInRow(SudokuBoard board, int x, int number) {
        for (int i = 0; i < 9; i++) {
            if (board.getRows().get(x).getCells().get(i).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInBox(SudokuBoard board, int x, int y, int number) {
        int boxRow = x - x % 3;
        int boxColumn = y - y % 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxColumn; j < boxColumn + 3; j++) {
                if (board.getRows().get(i).getCells().get(j).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPossiblePlace(SudokuBoard board, int x, int y, int number) {
        return !isNumberInBox(board, x, y, number) && !isNumberInColumn(board, y, number) && !isNumberInRow(board, x, number);
    }

    public void easyLevel(SudokuBoard board) throws CloneNotSupportedException {
        Random random = new Random();
        int counter = 0;

        while (counter < 60) {
            SudokuBoard board1 = board.deepCopy();
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(board1, one, two, three) && board.getRows().get(one).getCells().get(two).getValue() == -1) {
                board1.addElement(one + 1, two + 1, three);
                if (resolveSudoku(board1)) {
                    board.addElement(one + 1, two + 1, three);
                    counter++;
                }
            }
        }
    }

    public void normalLevel(SudokuBoard board) throws CloneNotSupportedException {
        Random random = new Random();
        int counter = 0;

        while (counter < 40) {
            SudokuBoard board1 = board.deepCopy();
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(board1, one, two, three) && board.getRows().get(one).getCells().get(two).getValue() == -1) {
                board1.addElement(one + 1, two + 1, three);
                if (resolveSudoku(board1)) {
                    board.addElement(one + 1, two + 1, three);
                    counter++;
                }
            }
        }
    }

    public void hardLevel(SudokuBoard board) throws CloneNotSupportedException {
        Random random = new Random();
        int counter = 0;

        while (counter < 20) {
            SudokuBoard board1 = board.deepCopy();
            int one = random.nextInt(9);
            int two = random.nextInt(9);
            int three = random.nextInt(9) + 1;
            if (isPossiblePlace(board1, one, two, three) && board.getRows().get(one).getCells().get(two).getValue() == -1) {
                board1.addElement(one + 1, two + 1, three);
                if (resolveSudoku(board1)) {
                    board.addElement(one + 1, two + 1, three);
                    counter++;
                }
            }
        }
    }
}
