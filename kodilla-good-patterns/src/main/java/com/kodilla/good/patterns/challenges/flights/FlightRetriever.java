package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class FlightRetriever {

    public static Map<FlightTimes, Flight> retrieve() {

        Map<FlightTimes, Flight> flightMap = new TreeMap<>();

        FlightTimes flightTimes1 = new FlightTimes(LocalTime.of(0, 12), LocalTime.of(1, 30));
        FlightTimes flightTimes2 = new FlightTimes(LocalTime.of(1, 27), LocalTime.of(2, 14));
        FlightTimes flightTimes3 = new FlightTimes(LocalTime.of(1, 32), LocalTime.of(2, 40));
        FlightTimes flightTimes4 = new FlightTimes(LocalTime.of(2, 11), LocalTime.of(3, 22));
        FlightTimes flightTimes5 = new FlightTimes(LocalTime.of(3, 10), LocalTime.of(4, 1));
        FlightTimes flightTimes6 = new FlightTimes(LocalTime.of(3, 52), LocalTime.of(4, 59));
        FlightTimes flightTimes7 = new FlightTimes(LocalTime.of(4, 12), LocalTime.of(5, 30));
        FlightTimes flightTimes8 = new FlightTimes(LocalTime.of(4, 19), LocalTime.of(5, 33));
        FlightTimes flightTimes9 = new FlightTimes(LocalTime.of(5, 41), LocalTime.of(7, 10));
        FlightTimes flightTimes10 = new FlightTimes(LocalTime.of(7, 12), LocalTime.of(8, 20));
        FlightTimes flightTimes11 = new FlightTimes(LocalTime.of(8, 9), LocalTime.of(9, 44));
        FlightTimes flightTimes12 = new FlightTimes(LocalTime.of(9, 30), LocalTime.of(10, 22));
        FlightTimes flightTimes13 = new FlightTimes(LocalTime.of(10, 15), LocalTime.of(11, 51));
        FlightTimes flightTimes14 = new FlightTimes(LocalTime.of(12, 1), LocalTime.of(13, 30));
        FlightTimes flightTimes15 = new FlightTimes(LocalTime.of(13, 41), LocalTime.of(14, 47));
        FlightTimes flightTimes16 = new FlightTimes(LocalTime.of(15, 20), LocalTime.of(16, 40));
        FlightTimes flightTimes17 = new FlightTimes(LocalTime.of(16, 17), LocalTime.of(17, 51));
        FlightTimes flightTimes18 = new FlightTimes(LocalTime.of(18, 33), LocalTime.of(19, 26));
        FlightTimes flightTimes19 = new FlightTimes(LocalTime.of(20, 12), LocalTime.of(21, 32));
        FlightTimes flightTimes20 = new FlightTimes(LocalTime.of(22, 39), LocalTime.of(23, 40));

        Flight flight = new Flight("Goleniow", "Warszawa");
        Flight flight1 = new Flight("Warszawa", "Goleniow");
        Flight flight2 = new Flight("Warszawa", "Poznan");
        Flight flight3 = new Flight("Warszawa", "Krakow");
        Flight flight4 = new Flight("Goleniow", "Poznan");
        Flight flight5 = new Flight("Krakow", "Warszawa");
        Flight flight6 = new Flight("Krakow", "Poznan");
        Flight flight7 = new Flight("Poznan", "Krakow");
        Flight flight8 = new Flight("Lodz", "Poznan");
        Flight flight9 = new Flight("Warszawa", "Lodz");
        Flight flight10 = new Flight("Poznan", "Lodz");
        Flight flight11 = new Flight("Krakow", "Lodz");
        Flight flight12 = new Flight("Lodz", "Warszawa");
        Flight flight13 = new Flight("Poznan", "Gdansk");

        flightMap.put(flightTimes1, flight);
        flightMap.put(flightTimes2, flight1);
        flightMap.put(flightTimes3, flight2);
        flightMap.put(flightTimes4, flight3);
        flightMap.put(flightTimes5, flight4);
        flightMap.put(flightTimes6, flight5);
        flightMap.put(flightTimes7, flight6);
        flightMap.put(flightTimes8, flight7);
        flightMap.put(flightTimes9, flight8);
        flightMap.put(flightTimes10, flight9);
        flightMap.put(flightTimes11, flight10);
        flightMap.put(flightTimes12, flight11);
        flightMap.put(flightTimes13, flight12);
        flightMap.put(flightTimes14, flight13);
        flightMap.put(flightTimes15, flight);
        flightMap.put(flightTimes16, flight1);
        flightMap.put(flightTimes17, flight2);
        flightMap.put(flightTimes18, flight3);
        flightMap.put(flightTimes19, flight4);
        flightMap.put(flightTimes20, flight5);

        return flightMap;
    }
}
