package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{1, 2, 4, 5, 6, -2, 5, 4, 6};

        //When
        double average = getAverage(numbers);

        //Then
        assertEquals(3.4, average, 0.1);
    }
}
