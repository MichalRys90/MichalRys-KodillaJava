package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void PizzaDecoratorTest () {
        //Given
        PizzaDecorator pizzaDecorator = new ClassicPizza();
        pizzaDecorator = new AnchovyPizza(pizzaDecorator);
        pizzaDecorator = new Ham(pizzaDecorator);
        pizzaDecorator = new Salami(pizzaDecorator);
        pizzaDecorator = new ExtraCheese(pizzaDecorator);
        pizzaDecorator = new Champignons(pizzaDecorator);

        //When
        String pizza = pizzaDecorator.getComponent();
        BigDecimal pizzaCost = pizzaDecorator.getPizzaCost();

        //Then
        assertEquals("your pizza consists of: pizza dough" +
                " + tomato sauce + cheese + anchovy + ham + salami + extra cheese + champignons", pizza);
        assertEquals(new BigDecimal(29), pizzaCost);
    }
}
