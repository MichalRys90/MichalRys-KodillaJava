package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DIVING= "DIVING";
    public static final String SHOPPING= "SHOPPING";
    public static final String PAINTING= "PAINTING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DIVING -> new DrivingTask("Diving", "Brazil", "Drinking straw");
            case SHOPPING -> new ShoppingTask("Shopping", "new Mercedes", 3);
            case PAINTING -> new PaintingTask("Painting", "Red", "Blood");
            default -> null;
        };
    }
}
