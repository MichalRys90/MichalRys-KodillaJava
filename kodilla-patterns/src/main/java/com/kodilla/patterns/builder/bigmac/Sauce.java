package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String ISLAND1000 = "1000ISLAND";
    public static final String BARBECUE = "BARBECUE";
    private String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(ISLAND1000) || sauce.equals(BARBECUE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("We dont have this sauce");
        }
    }

    @Override
    public String toString() {
        return sauce;
    }
}
