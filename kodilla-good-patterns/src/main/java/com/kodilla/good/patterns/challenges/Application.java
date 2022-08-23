package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequest();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ProductService(), new ProductRepository());
        productOrderService.process(orderRequest);
    }
}