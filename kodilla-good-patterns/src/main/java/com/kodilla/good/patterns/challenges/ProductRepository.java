package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ProductRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime from) {

        System.out.println("At " + LocalTime.now() + " shipped from the warehouse " + product.getProductName()
                + " to " + user.getFirsName() + " " + user.getLastName());
        return true;
    }
}
