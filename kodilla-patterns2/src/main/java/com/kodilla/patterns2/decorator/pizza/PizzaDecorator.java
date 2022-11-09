package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaDecorator {

    BigDecimal getPizzaCost();
    String getComponent();
}
