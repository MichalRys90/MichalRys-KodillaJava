package com.kodilla.rps;

import com.kodilla.rps.exceptions.BadChoiceException;
import com.kodilla.rps.games.EasyGame;
import com.kodilla.rps.games.Game;
import com.kodilla.rps.games.HardGame;
import com.kodilla.rps.games.LizardAndSpoke;
import com.kodilla.rps.names.PlayerName;

import java.util.Scanner;

import static com.kodilla.rps.names.Strings.hello;
import static com.kodilla.rps.names.Strings.choose;
import static com.kodilla.rps.names.Strings.giveName;

public class MainManu {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    EasyGame easyGame = new EasyGame();
    HardGame hardGame = new HardGame();
    LizardAndSpoke lizardAndSpoke = new LizardAndSpoke();
    PlayerName playerName = new PlayerName();

    public void interfejsFirst() throws BadChoiceException {
        System.out.println(giveName);
        playerName.getName();
        System.out.println(hello);
    }
    public void interfejs() throws BadChoiceException {
        System.out.println(choose);
        int i = scanner.next().charAt(0);
        boolean isTrue = true;
        while (isTrue) {
            switch (i) {

                case '1':
                    isTrue = false;
                    game.game();
                    break;

                case '2':
                    isTrue = false;
                    easyGame.easyGame();
                    break;

                case '3':
                    isTrue = false;
                    hardGame.hardGame();
                    break;
                case '4':
                    isTrue = false;
                    lizardAndSpoke.gameSpock();
                    break;
                case '5':
                    isTrue = false;
                    break;

                default:
                    System.out.println("Not a defined operation, Exit");
                    isTrue = false;
            }
        }
    }
}
