package com.kodilla;

import com.kodilla.sudoku.game.Game;
import com.kodilla.sudoku.game.GameLevel;
import com.kodilla.sudoku.game.MainMenu;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        MainMenu mainMenu = new MainMenu();
        mainMenu.play();
    }
}