package com.kodilla.rps;

import com.kodilla.rps.exceptions.BadChoiceException;

public class RpsRunner {

    public static void main(String[] args) throws BadChoiceException {

        MainManu mainManu = new MainManu();
        mainManu.interfejsFirst();
        mainManu.interfejs();
    }
}
