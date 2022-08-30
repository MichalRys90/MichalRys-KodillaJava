package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {



    @Test
    void CalculatorTestSuite() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);


        //When
        double add = calculator.add(5, 4);
        double sub = calculator.sub(6.2, 5.1);
        double mul = calculator.mul(3.3, 4.1);
        double div = calculator.div(6.4, 2);

        //Then
        assertEquals(9, add);
        assertEquals(1.1, sub, 0.01);
        assertEquals(13.53, mul, 0.01);
        assertEquals(3.2, div);
    }
}
