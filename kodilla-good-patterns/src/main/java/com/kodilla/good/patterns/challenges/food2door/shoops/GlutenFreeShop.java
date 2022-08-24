package com.kodilla.good.patterns.challenges.food2door.shoops;

import com.kodilla.good.patterns.challenges.food2door.delivery.DeliveryRequest;
import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {

    private static final String NAME = "Gluten Free Shop";
    private final Map<String, Integer> product = new HashMap<>();

    public GlutenFreeShop() {
        product.put("Corn", 300);
        product.put("Rice", 200);
        product.put("Soy", 100);
        product.put("Potatoes", 500);
    }

    public Map<String, Integer> getProduct() {
        return product;
    }

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        if (!product.containsKey(deliveryRequest.getProduct())) {
            System.out.println("The supplier does not have the product on offer " + "\"" + deliveryRequest.getProduct() + "\"");
            return false;
        } else if (product.get(deliveryRequest.getProduct()) < deliveryRequest.getQuantity()) {
            System.out.println("The supplier does not have enough product");
            System.out.println("The supplier have only " + product.get(deliveryRequest.getProduct())
                    + " " + deliveryRequest.getProduct() + " you wanted " + deliveryRequest.getQuantity());
            return false;
        } else if (deliveryRequest.getQuantity() < 100) {
            System.out.println("Not enough products ordered");
            System.out.println("Order must be greater than 100 you ordered only " + deliveryRequest.getQuantity());
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
