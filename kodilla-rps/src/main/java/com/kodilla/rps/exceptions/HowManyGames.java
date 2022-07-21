package com.kodilla.rps.exceptions;

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
            return howManyGames.moreThanZero();
        } catch (InputMismatchException e) {
            System.out.println("You have to choose integer \n" + e);
        } catch (BadChoiceException e) {
            System.out.println(e);
        }
        return 0;
    }
}
