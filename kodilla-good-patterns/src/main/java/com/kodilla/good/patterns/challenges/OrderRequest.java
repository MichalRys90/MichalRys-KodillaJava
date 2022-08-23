package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime from;
    private Product product;

    public OrderRequest(User user, Product product, LocalDateTime from) {
        this.user = user;
        this.from = from;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public Product getProduct() {
        return product;
    }
}
