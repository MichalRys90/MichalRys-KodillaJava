package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor szymon = new Mentor("Szymon");
        Mentor andrzej = new Mentor("Andrzej");
        Task michal = new Task("Michal");
        Task adam = new Task("Adam");
        Task ewa = new Task("Ewa");
        michal.addMentor(szymon);
        michal.addMentor(andrzej);
        adam.addMentor(andrzej);
        ewa.addMentor(szymon);

        //When
        michal.addTask("exercise 1");
        adam.addTask("exercise 1");
        michal.addTask("exercise 2");
        ewa.addTask("exercise 1");
        michal.addTask("exercise 3");
        ewa.addTask("exercise 2");

        //Then
        assertEquals(5, szymon.getCount());
        assertEquals(4, andrzej.getCount());
    }
}
