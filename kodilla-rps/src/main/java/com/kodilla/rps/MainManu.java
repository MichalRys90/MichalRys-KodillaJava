package com.kodilla.rps;
import com.kodilla.rps.games.EasyGame;
import com.kodilla.rps.games.Game;
import com.kodilla.rps.games.HardGame;
import com.kodilla.rps.games.LizardAndSpoke;
import com.kodilla.rps.names.PlayerName;

import java.util.Scanner;

import static com.kodilla.rps.Strings.hello;
import static com.kodilla.rps.Strings.choose;
import static com.kodilla.rps.Strings.giveName;

public class MainManu {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    EasyGame easyGame = new EasyGame();
    HardGame hardGame = new HardGame();
    LizardAndSpoke lizardAndSpoke = new LizardAndSpoke();
    PlayerName playerName = new PlayerName();
    public void interfejs(){
        System.out.println(giveName);
        playerName.getName();
        System.out.println(hello);
        System.out.println(choose);
        int i = scanner.next().charAt(0);
        switch (i) {

            case '1' :
                game.game();
                break;

            case '2' :
                easyGame.easyGame();
                break;

            case '3' :
                hardGame.hardGame();
                break;
            case '4' :
                lizardAndSpoke.gameSpock();
                break;

            default: System.out.println("Not a defined operation");
        }
    }

}
