package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> theWorldSet = new HashSet<>();

    public void addContinent(Continent continent){
        theWorldSet.add(continent);
    }

    public Set<Continent> getTheWorldSet() {
        return theWorldSet;
    }

    @Override
    public String toString() {
        return "World{" +
                "theWorldSet=" + theWorldSet +
                '}';
    }

    public BigDecimal getPeopleQuantity(){
        return theWorldSet.stream()
                .flatMap(continent -> continent.getTheContinentSet().stream())
                .map(Country::getPopulationQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
