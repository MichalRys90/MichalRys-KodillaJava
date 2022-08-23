package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDateTime from) {

        System.out.println("Day " + LocalDate.now() + " the product was ordered: " + product.getProductName() + " by " + user.getFirsName() +
                " " + user.getLastName());
        return true;
    }
}
