package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String toBeautify, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(toBeautify));
    }
}
