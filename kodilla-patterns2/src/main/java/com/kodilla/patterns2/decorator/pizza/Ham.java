package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Ham extends AbstractPizzaDecorator{
    public Ham(PizzaDecorator pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + ham";
    }
}
