package com.kodilla.sudoku.board;

import com.kodilla.sudoku.prototype.Prototype;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {

    private List<SudokuRow> rows = new ArrayList<>();

    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            rows.add(new SudokuRow());
        }
        for (SudokuRow row : rows) {
            row.addCells();
        }
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard cloneBoard = super.clone();
        cloneBoard.rows = new ArrayList<>();
        for (SudokuRow row : rows) {
            SudokuRow clonedRows = new SudokuRow();
            for (SudokuElement element : row.getCells()) {
                clonedRows.getCells().add(element);
            }
            cloneBoard.getRows().add(clonedRows);
        }
        return cloneBoard;
    }

    public void addElement(int x, int y, int input) {
        rows.get(x - 1).getCells().set(y - 1, new SudokuElement(input));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("   1 2 3 4 5 6 7 8 9 \n");
        str.append("  -------------------\n");
        for (int i = 0; i < 9; i++) {
            str.append(i + 1);
            str.append(" ");
            str.append("!");
            for (int j = 0; j < 9; j++) {
                if (rows.get(i).getCells().get(j).getValue() == -1) {
                    str.append(" ");
                } else {
                    str.append(rows.get(i).getCells().get(j).getValue());
                }
                if (j == 2 || j == 5 || j == 8) {
                    str.append("!");
                } else {
                    str.append("|");
                }
            }
            if (i == 2 || i == 5 || i == 8) {
                str.append("\n  -------------------\n");
            } else {
                str.append("\n");
            }
        }
        return str.toString();
    }
}
