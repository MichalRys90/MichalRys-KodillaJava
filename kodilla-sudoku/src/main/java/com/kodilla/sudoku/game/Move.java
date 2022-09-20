package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.exception.BadChoiceException;

import java.util.*;

public class Move {

    static Scanner scanner = new Scanner(System.in);


    public void game(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        Move move = new Move();
        System.out.println("Enter the numbers in the order row, column, number." +
                " \nCharacters other than 1-9 will not be included.");

        System.out.println();
        System.out.println("If you wanna solve sudoku write \"SUDOKU\"");
        System.out.println(sudokuBoard);
        move.input(sudokuBoard);
    }

    public void input(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        SudokuGame sudokuGame = new SudokuGame();
        List<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        while (!s.equals("SUDOKU")) {
            List<String> line = Arrays.stream(s.split(""))
                    .filter(a -> a.matches("[0-9]")).toList();

            for (String s1 : line) {
                try {
                    if (Integer.parseInt(s1) < 10 && Integer.parseInt(s1) > 0) {
                        list.add(Integer.parseInt(s1));
                    } else throw new BadChoiceException("Integer must be greater than 0");
                } catch (BadChoiceException e) {
                    System.out.println(e);
                }
            }
            for (int i = 0; i < list.size() - 2; i += 3) {
                SudokuBoard board = sudokuBoard.deepCopy();
                boolean check = sudokuGame.isPossiblePlace(board,list.get(i) - 1, list.get(i + 1) - 1, list.get(i + 2));
                if (check && sudokuBoard.getRows().get(list.get(i) - 1).getCells().get(list.get(i + 1) - 1).getValue() == -1) {
                    sudokuBoard.addElement(list.get(i), list.get(i + 1), list.get(i + 2));
                    System.out.println(sudokuBoard);
                } else {
                    System.out.println("Impossible place we need to go back to the previous version ");
                    board.addElement(list.get(i), list.get(i + 1), list.get(i + 2));
                    System.out.println(board);
                    System.out.println(sudokuBoard);
                }
            }
            list.clear();
            s = scanner.nextLine();
        }
    }
}
