package com.kodilla.good.patterns.challenges.food2door.shoops;

import com.kodilla.good.patterns.challenges.food2door.delivery.DeliveryRequest;
import com.kodilla.good.patterns.challenges.food2door.delivery.ProductData;
import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {

    private static final String NAME = "Healthy Shop";
    private final Map<String, ProductData> product = new HashMap<>();

    public HealthyShop() {
        product.put("Eggs", new ProductData(1000, 0.25));
        product.put("Tomatoes", new ProductData(150, 0.50));
        product.put("Peanuts", new ProductData(200, 1));
        product.put("Apple juice", new ProductData(300, 2.20));
    }

    public Map<String, ProductData> getProduct() {
        return product;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        if (!product.containsKey(deliveryRequest.getProduct())) {
            System.out.println("The supplier does not have the product on offer " + "\"" + deliveryRequest.getProduct() + "\"");
            return false;
        } else if (product.get(deliveryRequest.getProduct()).getQuantity() < deliveryRequest.getQuantity()) {
            System.out.println("The supplier does not have enough product");
            System.out.println("The supplier have only " + product.get(deliveryRequest.getProduct()).getQuantity()
                    + " " + deliveryRequest.getProduct() + " you wanted " + deliveryRequest.getQuantity());
            return false;
        } else if (product.get(deliveryRequest.getProduct()).getQuantity()
                * product.get(deliveryRequest.getProduct()).getPrice() < 500) {
            System.out.println("Too small order amount");
            System.out.println("minimum order amount is 500pln, your order is only " +
                    product.get(deliveryRequest.getProduct()).getQuantity()
                            * product.get(deliveryRequest.getProduct()).getPrice()+"pln");
            return false;
        }
        return true;
    }
}
