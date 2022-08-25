package com.kodilla.good.patterns.challenges.flights;

import java.util.*;
import java.util.stream.Collectors;

public class Timetable {

    private final Map<FlightTimes, Flight> flights = FlightRetriever.retrieve();

    public void flightsFrom(String departureAirport) {

        Map<FlightTimes, Flight> collect = flights.entrySet()
                .stream()
                .filter(p -> p.getValue().getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<FlightTimes, Flight> sort = new TreeMap<>(collect);

        for (Map.Entry<FlightTimes, Flight> entry : sort.entrySet()) {
            System.out.println("Departure Time: " + entry.getKey().getDepartureTime() +
                    " Departure airport " + entry.getValue().getDepartureAirport() + " Arrival time is: "
                    + entry.getKey().getArrivalTime()
                    + " Arrival airport : " + entry.getValue().getArrivalAirport());
        }
    }

    public void flightsTo(String arrivalAirport) {

        Map<FlightTimes, Flight> collect = flights.entrySet()
                .stream()
                .filter(p -> p.getValue().getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<FlightTimes, Flight> sort = new TreeMap<>(collect);

        for (Map.Entry<FlightTimes, Flight> entry : sort.entrySet()) {
            System.out.println("Departure Time: " + entry.getKey().getDepartureTime() +
                    " Departure airport " + entry.getValue().getDepartureAirport() + " Arrival time is: "
                    + entry.getKey().getArrivalTime()
                    + " Arrival airport : " + entry.getValue().getArrivalAirport());
        }
    }

    public void flightThrough(String departureAirport, String arrivalAirport) {


        Map<FlightTimes, Flight> temp = flights.entrySet()
                .stream()
                .filter(p -> p.getValue().getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<FlightTimes, Flight> temp2 = flights.entrySet()
                .stream()
                .filter(p -> p.getValue().getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        Map<FlightTimes, Flight> collect = new TreeMap<>();

        for (Map.Entry<FlightTimes, Flight> entry : temp.entrySet()) {
            for (Map.Entry<FlightTimes, Flight> entr : temp2.entrySet()) {
                if ((entry.getValue().getArrivalAirport().equals(entr.getValue().getDepartureAirport()))
                        && (entry.getKey().getArrivalTime().isBefore(entr.getKey().getDepartureTime()))) {
                    collect.put(entry.getKey(), entry.getValue());
                    collect.put(entr.getKey(), entr.getValue());
                }
            }
        }

        for (Map.Entry<FlightTimes, Flight> entry : collect.entrySet()) {
            System.out.println("Departure Time: " + entry.getKey().getDepartureTime() +
                    " Departure airport " + entry.getValue().getDepartureAirport() + " Arrival time is: "
                    + entry.getKey().getArrivalTime()
                    + " Arrival airport : " + entry.getValue().getArrivalAirport());
        }
    }
}
