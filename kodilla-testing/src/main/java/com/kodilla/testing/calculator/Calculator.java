package com.kodilla.testing.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int sum() {
        return this.firstNumber + this.secondNumber;
    }

    public int subtract() {

        return this.firstNumber - this.secondNumber;
    }

}
