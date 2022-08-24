package com.kodilla.good.patterns.challenges.food2door.shoops;

import com.kodilla.good.patterns.challenges.food2door.delivery.DeliveryRequest;
import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {
    private static final String NAME = "Extra Food Shop";
    private final Map<String, Integer> product = new HashMap<>();

    public ExtraFoodShop() {
        product.put("Chicken", 200);
        product.put("Pork", 150);
        product.put("Buckwheat groats", 200);
        product.put("Pear juice", 50);
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
        }
        return true;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
