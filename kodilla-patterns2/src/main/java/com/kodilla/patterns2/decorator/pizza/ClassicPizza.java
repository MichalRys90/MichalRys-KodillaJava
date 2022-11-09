package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ClassicPizza implements PizzaDecorator{
    @Override
    public BigDecimal getPizzaCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getComponent() {
        return "your pizza consists of: pizza dough + tomato sauce + cheese";
    }
}
