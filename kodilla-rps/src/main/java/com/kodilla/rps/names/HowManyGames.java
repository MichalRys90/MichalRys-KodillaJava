package com.kodilla.rps.names;

import com.kodilla.rps.BadChoiceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HowManyGames {
    Scanner scanner = new Scanner(System.in);

    public int moreThanZero() throws BadChoiceException {
        int gamesHowMany = scanner.nextInt();
        if (gamesHowMany > 0) {
            return gamesHowMany;
        } else {
            throw new BadChoiceException("Integer must be greater than zero");
        }
    }

    public int howManyGames() {
        HowManyGames howManyGames = new HowManyGames();
        try {
            int gamesHowMany1 = howManyGames.moreThanZero();
            return gamesHowMany1;
        } catch (InputMismatchException e) {
            System.out.println("You have to choose integer \n" + e);
        } catch (BadChoiceException e) {
            System.out.println("Choose integer greater than 0");
        }
        return 0;
    }
}
