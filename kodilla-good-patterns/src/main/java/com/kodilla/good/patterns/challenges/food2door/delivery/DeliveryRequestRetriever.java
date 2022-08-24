package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;
import com.kodilla.good.patterns.challenges.food2door.shoops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shoops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shoops.HealthyShop;

public class DeliveryRequestRetriever {
    public DeliveryRequest delivery() {
        Supplier supplier = new ExtraFoodShop();
        String product = "Pork";
        int quantity = 100;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery1() {
        Supplier supplier = new ExtraFoodShop();
        String product = "Apple";
        int quantity = 100;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery2() {
        Supplier supplier = new ExtraFoodShop();
        String product = "Pork";
        int quantity = 200;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery3() {
        Supplier supplier = new GlutenFreeShop();
        String product = "Corn";
        int quantity = 250;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery4() {
        Supplier supplier = new GlutenFreeShop();
        String product = "Corn";
        int quantity = 80;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery5() {
        Supplier supplier = new GlutenFreeShop();
        String product = "Pork";
        int quantity = 100;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery6() {
        Supplier supplier = new GlutenFreeShop();
        String product = "Rice";
        int quantity = 250;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery7() {
        Supplier supplier = new HealthyShop();
        String product = "Apple juice";
        int quantity = 251;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery8() {
        Supplier supplier = new HealthyShop();
        String product = "Pork";
        int quantity = 100;
        return new DeliveryRequest(supplier, product, quantity);
    }
    public DeliveryRequest delivery9() {
        Supplier supplier = new HealthyShop();
        String product = "Apple juice";
        int quantity = 400;
        return new DeliveryRequest(supplier, product, quantity);
    }

    public DeliveryRequest delivery10() {
        Supplier supplier = new HealthyShop();
        String product = "Eggs";
        int quantity = 500;
        return new DeliveryRequest(supplier, product, quantity);
    }
}
