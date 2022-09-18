package com.kodilla.sudoku.board;


import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> cells = new ArrayList<>();

    public SudokuRow() {
    }

    public void addCells() {
        for (int i = 0; i < 9; i++) {
            cells.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    public List<SudokuElement> getCells() {
        return cells;
    }
}
