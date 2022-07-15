package com.kodilla.rps.names;

import java.util.Scanner;

public class PlayerName {
    public static String name;
    Scanner scanner = new Scanner(System.in);
    public String getName(){
        name = scanner.nextLine();
        return name;
    }
}
