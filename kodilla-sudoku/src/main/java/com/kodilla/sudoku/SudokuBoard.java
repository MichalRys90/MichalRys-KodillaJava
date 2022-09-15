package com.kodilla.sudoku;

import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> rows;

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("---------------------------\n");
        for (int i = 0; i < 9; i++) {
            str.append("|");
            for (int j = 0; j < 9; j++) {
                if (rows.get(i).getCells().get(j).getValue() == -1) {
                    str.append(" ");
                } else {
                    str.append(rows.get(i).getCells().get(j).getValue());
                }
            str.append("|");
            }
            str.append("\n---------------------------\n");
        }
        return str.toString();
    }
}
