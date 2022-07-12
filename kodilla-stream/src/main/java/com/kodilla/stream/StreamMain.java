package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Make me beautiful", text -> "ASD " + text + " ASD");
        poemBeautifier.beautify("Make me beautiful", text -> text.toUpperCase());
        poemBeautifier.beautify("Make me beautiful", text -> text.toLowerCase());
        poemBeautifier.beautify("Make me beautiful!! ", text -> text.repeat(3));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}