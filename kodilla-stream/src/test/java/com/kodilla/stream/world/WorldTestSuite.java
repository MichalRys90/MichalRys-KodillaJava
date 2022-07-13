package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void WorldTestSuite() {
        //Given
        Country poland = new Country("Poland", "37950000");
        Country poland1 = new Country("Poland", "37950000");
        Country england = new Country("England", "55980000");
        Country spain = new Country("Spain", "47350000");
        Country germany = new Country("Germany", "83240000");
        Country argentina = new Country("Argentina", "45380000");
        Country brazil = new Country("Brazil", "216600000");
        Country uruguay = new Country("Uruguay", "3474000");
        Country usa = new Country("USA", "329500000");
        Country mexico = new Country("Mexico", "128900000");
        Country canada = new Country("Canada", "38010000");
        Country egypt = new Country("Egypt", "102300000");
        Country ivoryCoast = new Country("Ivory Coast", "26380000");
        Country algeria = new Country("Algeria", "43850000");
        Country china = new Country("China", "1402000000");
        Country india = new Country("India", "1380000000");
        Country kazakhstan = new Country("Kazakhstan", "18750000");
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(england);
        europe.addCountry(spain);
        europe.addCountry(germany);
        europe.addCountry(poland1);
        Continent southAmerica = new Continent();
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(uruguay);
        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        Continent africa = new Continent();
        africa.addCountry(egypt);
        africa.addCountry(ivoryCoast);
        africa.addCountry(algeria);
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(kazakhstan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);
        world.addContinent(africa);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("3959664000");

        //Then
        assertEquals(expectedResult, totalPeople);
    }
}
