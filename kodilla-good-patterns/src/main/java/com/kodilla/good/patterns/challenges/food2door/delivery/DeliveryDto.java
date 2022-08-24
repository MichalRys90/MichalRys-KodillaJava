package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

public class DeliveryDto {

    private Supplier supplier;
    private boolean isOrdered;

    public DeliveryDto(Supplier supplier, boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
