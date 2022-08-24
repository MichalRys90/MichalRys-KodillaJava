package com.kodilla.good.patterns.challenges.food2door.interfaces;

import com.kodilla.good.patterns.challenges.food2door.delivery.DeliveryRequest;

public interface Supplier {
boolean process(DeliveryRequest deliveryRequest);
String getName();
}
