package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliveryService;

public class Order implements DeliveryService {
    @Override
    public void createOrder(String product, int quantity) {
        System.out.println(+ quantity + " " + product + " were ordered");
    }
}
