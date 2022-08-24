package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

public class DeliveryRequest {

    private Supplier supplier;
    private String Product;
    private int quantity;

    public DeliveryRequest(Supplier supplier, String product, int quantity) {
        this.supplier = supplier;
        Product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return Product;
    }

    public int getQuantity() {
        return quantity;
    }
}
