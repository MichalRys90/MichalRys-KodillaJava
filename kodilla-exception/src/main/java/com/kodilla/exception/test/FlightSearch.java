package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightFind = new HashMap<>();
        flightFind.put("Madrid", true);

        Boolean canFly = flightFind.get(flight.getArrivalAirport());

        if (canFly != null) {
            return canFly;
        } else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}
