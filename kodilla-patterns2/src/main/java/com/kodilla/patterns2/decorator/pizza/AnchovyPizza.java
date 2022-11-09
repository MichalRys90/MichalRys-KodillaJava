package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AnchovyPizza extends AbstractPizzaDecorator {
    public AnchovyPizza(PizzaDecorator pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(5));
    }

    @Override
    public String getComponent() {
        return super.getComponent() + " + anchovy";
    }
}
