package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main(String[] args) {

        Timetable timetable = new Timetable();
        timetable.flightsFrom("Warszawa");
        System.out.println();
        timetable.flightsTo("Poznan");
        System.out.println();
        timetable.flightThrough("Warszawa", "Poznan");
    }
}
