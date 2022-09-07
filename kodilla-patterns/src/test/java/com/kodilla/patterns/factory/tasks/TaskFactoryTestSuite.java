package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory task = new TaskFactory();

        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        String taskName = painting.getTaskName();
        painting.executeTask();
        boolean isTaskDone = painting.isTaskExecuted();

        //Then
        assertEquals("Painting", taskName);
        assertTrue(isTaskDone);
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory task = new TaskFactory();

        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        String taskName = shopping.getTaskName();
        shopping.executeTask();
        boolean isTaskDone = shopping.isTaskExecuted();

        //Then
        assertEquals("Shopping", taskName);
        assertTrue(isTaskDone);
    }

    @Test
    void testFactoryDiving() {
        //Given
        TaskFactory task = new TaskFactory();

        //When
        Task diving = task.makeTask(TaskFactory.DIVING);
        String taskName = diving.getTaskName();
        diving.executeTask();
        boolean isTaskDone = diving.isTaskExecuted();

        //Then
        assertEquals("Diving", taskName);
        assertTrue(isTaskDone);
    }
}
