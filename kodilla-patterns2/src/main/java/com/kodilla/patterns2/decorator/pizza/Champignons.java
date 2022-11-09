package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Champignons extends AbstractPizzaDecorator{
    public Champignons(PizzaDecorator pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(1));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + champignons";
    }
}
