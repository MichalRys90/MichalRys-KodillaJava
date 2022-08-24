package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.delivery.*;

public class Application {

    public static void main(String[] args) {
        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.delivery();
        DeliveryRequest deliveryRequest1 = deliveryRequestRetriever.delivery1();
        DeliveryRequest deliveryRequest2 = deliveryRequestRetriever.delivery2();
        DeliveryRequest deliveryRequest3 = deliveryRequestRetriever.delivery3();
        DeliveryRequest deliveryRequest4 = deliveryRequestRetriever.delivery4();
        DeliveryRequest deliveryRequest5 = deliveryRequestRetriever.delivery5();
        DeliveryRequest deliveryRequest6 = deliveryRequestRetriever.delivery6();
        DeliveryRequest deliveryRequest7 = deliveryRequestRetriever.delivery7();
        DeliveryRequest deliveryRequest8 = deliveryRequestRetriever.delivery8();
        DeliveryRequest deliveryRequest9 = deliveryRequestRetriever.delivery9();
        DeliveryRequest deliveryRequest10 = deliveryRequestRetriever.delivery10();



        DeliveryOrder deliveryOrder = new DeliveryOrder(new MailSystem(), new Order());
        deliveryOrder.processor(deliveryRequest);
        System.out.println();
        deliveryOrder.processor(deliveryRequest1);
        System.out.println();
        deliveryOrder.processor(deliveryRequest2);
        System.out.println();
        deliveryOrder.processor(deliveryRequest3);
        System.out.println();
        deliveryOrder.processor(deliveryRequest4);
        System.out.println();
        deliveryOrder.processor(deliveryRequest5);
        System.out.println();
        deliveryOrder.processor(deliveryRequest6);
        System.out.println();
        deliveryOrder.processor(deliveryRequest7);
        System.out.println();
        deliveryOrder.processor(deliveryRequest8);
        System.out.println();
        deliveryOrder.processor(deliveryRequest9);
        System.out.println();
        deliveryOrder.processor(deliveryRequest10);

    }
}
