package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.exception.BadChoiceException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kodilla.sudoku.game.Move.scanner;

public class MoveLevel {

    public void game(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        MoveLevel moveLevel = new MoveLevel();
        System.out.println("Enter the numbers in the order row, column, number." +
                " \nCharacters other than 1-9 will not be included.");

        System.out.println();
        System.out.println("If you wanna solve sudoku write \"SUDOKU\". \nif you make a mistake 3 times you will lose");
        System.out.println(sudokuBoard);
        moveLevel.input(sudokuBoard);
    }

    public void input(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        SudokuGame sudokuGame = new SudokuGame();
        SudokuBoard copy = sudokuBoard.deepCopy();
        List<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        int counter = 0;
        boolean checker = false;
        while (!s.equals("SUDOKU") && counter < 3 && !checker) {
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
                if (counter >= 3) {
                    break;
                }
                SudokuBoard board = sudokuBoard.deepCopy();
                SudokuBoard board1 = sudokuBoard.deepCopy();
                boolean check = sudokuGame.isPossiblePlace(sudokuBoard,list.get(i) - 1, list.get(i + 1) - 1, list.get(i + 2));
                boolean check2 = sudokuGame.resolveSudoku(board1);
                if (check && sudokuBoard.getRows().get(list.get(i) - 1).getCells().get(list.get(i + 1) - 1).getValue() == -1 && check2) {
                    sudokuBoard.addElement(list.get(i), list.get(i + 1), list.get(i + 2));
                    System.out.println(sudokuBoard);
                } else {
                    System.out.println("Impossible place we need to go back to the previous version ");
                    board.addElement(list.get(i), list.get(i + 1), list.get(i + 2));
                    System.out.println(board);
                    System.out.println(sudokuBoard);
                    counter++;
                    if (counter == 3) {
                        System.out.println("You lose! if you wanna play again press \"a\" \n If you wanna continue" +
                                "this game press: \"c\"");
                        s = scanner.nextLine();
                        if (s.equals("a")) {
                            sudokuBoard = copy;
                            counter = 0;
                            list.clear();
                            System.out.println(sudokuBoard);
                        } else if (s.equals("c")) {
                            counter = 0;
                            list.clear();
                            System.out.println(sudokuBoard);
                        }
                    }
                }
            }
            checker = checkWinner(sudokuBoard);
            list.clear();
            if (!checker && counter < 3) {
                s = scanner.nextLine();
            }
        }
    }

    public boolean checkWinner(SudokuBoard sudokuBoard) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuBoard.getRows().get(i).getCells().get(j).getValue() == -1) {
                    return false;
                }
            }
        }
        System.out.println("Congratulations!! YOU WON!!!");
        return true;
    }
}
