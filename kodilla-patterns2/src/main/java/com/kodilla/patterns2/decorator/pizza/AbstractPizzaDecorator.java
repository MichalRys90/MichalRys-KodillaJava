package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements PizzaDecorator{
    private final PizzaDecorator pizzaDecorator;

    public AbstractPizzaDecorator(PizzaDecorator pizzaDecorator) {
        this.pizzaDecorator = pizzaDecorator;
    }

    @Override
    public BigDecimal getPizzaCost() {
        return pizzaDecorator.getPizzaCost();
    }

    @Override
    public String getComponent() {
        return pizzaDecorator.getComponent();
    }
}
