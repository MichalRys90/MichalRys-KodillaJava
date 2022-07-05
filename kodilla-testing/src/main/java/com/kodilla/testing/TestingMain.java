package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5, 2);


        if ((calculator.getFirstNumber() + calculator.getSecondNumber() == calculator.sum())) {
            System.out.println("test for sum is ok");
        }
        else {
            System.out.println("the test for sum is not working properly");
        }
        if ((calculator.getFirstNumber() - calculator.getSecondNumber() == calculator.subtract())) {
            System.out.println("test for subtract is ok");
        }
        else {
            System.out.println("the test for subtract is not working properly");
        }


    }
}