package com.kodilla.good.patterns.challenges;

public class User {

    private String firsName;
    private String lastName;

    public User(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }
}
