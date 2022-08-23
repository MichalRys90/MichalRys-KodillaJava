package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest orderRequest() {
        User user = new User("Michal", "Rys");
        Product product = new Product("Fishing Rod");
        LocalDateTime from = LocalDateTime.of(2022, 8, 12, 12, 0);

        return new OrderRequest(user, product, from);
    }
}
