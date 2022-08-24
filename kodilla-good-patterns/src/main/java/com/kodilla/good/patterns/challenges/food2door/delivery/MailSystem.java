package com.kodilla.good.patterns.challenges.food2door.delivery;

import com.kodilla.good.patterns.challenges.food2door.interfaces.InformationSystem;
import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

public class MailSystem implements InformationSystem {
    @Override
    public void inform(Supplier supplier) {
        System.out.println("An email was sent to supplier " + supplier.getName());
    }
}
