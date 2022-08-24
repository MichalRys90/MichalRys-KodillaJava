package com.kodilla.good.patterns.challenges.food2door.delivery;

public class ProductData {

    private int quantity;
    private double price;

    public ProductData(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
