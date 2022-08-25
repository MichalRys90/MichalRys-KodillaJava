package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.Objects;

public class FlightTimes implements Comparable<FlightTimes>{

    private final LocalTime departureTime;
    private final LocalTime arrivalTime;

    public FlightTimes(LocalTime departureTime, LocalTime arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightTimes that = (FlightTimes) o;

        if (!Objects.equals(departureTime, that.departureTime))
            return false;
        return Objects.equals(arrivalTime, that.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = departureTime != null ? departureTime.hashCode() : 0;
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        return result;
    }

    private static final Comparator<FlightTimes> comparator =
            Comparator.comparing(FlightTimes::getDepartureTime)
                    .thenComparing(FlightTimes::getArrivalTime);


    @Override
    public int compareTo(FlightTimes that) {
       return comparator.compare(this, that);
    }
}

