package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> theContinentSet = new HashSet<>();

    public void addCountry(Country country){
        theContinentSet.add(country);
    }

    public Set<Country> getTheContinentSet() {
        return theContinentSet;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "theContinentSet=" + theContinentSet +
                '}';
    }
}
