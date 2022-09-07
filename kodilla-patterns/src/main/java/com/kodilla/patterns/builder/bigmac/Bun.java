package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String SESAMEBUN = "SESAMEBUN";
    public static final String NORMALBUN = "NORMALBUN";
    public static final String PUPPYSEEDBUN = "POPPYSEEDBUN";
    private final String bun;


    public Bun(String bun) {
        if (bun.equals(SESAMEBUN) || bun.equals(NORMALBUN) || bun.equals(PUPPYSEEDBUN)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("We dont have this bun");
        }
    }

    @Override
    public String toString() {
        return bun;
    }
}
