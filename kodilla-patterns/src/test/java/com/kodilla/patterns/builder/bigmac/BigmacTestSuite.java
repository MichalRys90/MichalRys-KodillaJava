package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigMac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun(Bun.NORMALBUN))
                .sauce(new Sauce(Sauce.ISLAND1000))
                .ingredient(new Ingredients(Ingredients.BACON))
                .burgers(2)
                .ingredient(new Ingredients(Ingredients.CHAMPIGNONS))
                .ingredient(new Ingredients(Ingredients.CHEESE))
                .ingredient(new Ingredients(Ingredients.ONION))
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Tnen
        assertEquals(4, howManyIngredients);
    }

}
