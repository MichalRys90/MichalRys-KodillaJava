package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.DeliveryService;
import com.kodilla.good.patterns.challenges.food2door.interfaces.InformationSystem;

public class DeliveryOrder {

    private InformationSystem informationSystem;
    private DeliveryService deliveryService;

    public DeliveryOrder(final InformationSystem informationSystem,
                               final DeliveryService deliveryService) {
        this.informationSystem = informationSystem;
        this.deliveryService = deliveryService;
    }

    public DeliveryDto processor(final DeliveryRequest deliveryRequest) {
        boolean isOrdered = deliveryRequest.getSupplier().process(deliveryRequest);

        if (isOrdered) {
            informationSystem.inform(deliveryRequest.getSupplier());
            deliveryService.createOrder(deliveryRequest.getProduct(), deliveryRequest.getQuantity());
            System.out.println("The order has been accepted");
            return new DeliveryDto(deliveryRequest.getSupplier(), true);
        } else {
            return new DeliveryDto(deliveryRequest.getSupplier(), false);
        }
    }
}
