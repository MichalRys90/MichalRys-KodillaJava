package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaDecorator{
    public Salami(PizzaDecorator pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(3));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + salami";
    }
}
