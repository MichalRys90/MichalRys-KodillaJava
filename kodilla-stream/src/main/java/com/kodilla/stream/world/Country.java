package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private final String numberOfPeople;

    public Country(String country, String numberOfPeople) {
        this.country = country;
        this.numberOfPeople = numberOfPeople;
    }

    public String getCountry() {
        return country;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                '}';
    }

    public BigDecimal getPopulationQuantity() {
        BigDecimal populationQuantity = new BigDecimal(numberOfPeople);
        return populationQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country1 = (Country) o;

        return country != null ? country.equals(country1.country) : country1.country == null;
    }

    @Override
    public int hashCode() {
        return country != null ? country.hashCode() : 0;
    }
}
