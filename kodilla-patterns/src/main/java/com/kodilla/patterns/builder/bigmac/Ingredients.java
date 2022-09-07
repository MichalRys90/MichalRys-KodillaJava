package com.kodilla.patterns.builder.bigmac;

public class Ingredients {

    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLIPEPPERS = "CHILLIPEPPERS";
    public static final String CHAMPIGNONS = "CHAMPIGNONS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";
    private String ingredients;

    public Ingredients(String ingredients) {
        if (ingredients.equals(LETTUCE) || ingredients.equals(ONION) || ingredients.equals(BACON)
                || ingredients.equals(CUCUMBER) || ingredients.equals(CHAMPIGNONS) || ingredients.equals(CHILLIPEPPERS)
                || ingredients.equals(PRAWNS) || ingredients.equals(CHEESE)) {
            this.ingredients = ingredients;
        } else {
            throw new IllegalStateException("We dont have this ingredients");
        }
    }

    @Override
    public String toString() {
        return ingredients;
    }
}
