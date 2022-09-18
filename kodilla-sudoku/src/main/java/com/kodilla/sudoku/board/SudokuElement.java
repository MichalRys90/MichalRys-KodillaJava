package com.kodilla.sudoku.board;

public class SudokuElement {

    private int value;
    public static int EMPTY = -1;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
