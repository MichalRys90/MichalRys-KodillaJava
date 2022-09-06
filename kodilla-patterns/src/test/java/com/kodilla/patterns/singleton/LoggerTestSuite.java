package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLog() {
        logger = Logger.LOGGER;
        logger.log("Hej, Hello");
    }

    @Test
    void testGetLog() {
        //Given

        //When
        String test = logger.getLastLog();

        //Then
        assertEquals("Hej, Hello", test);
    }
}
