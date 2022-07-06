package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        try {
            Integer result1[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            List<Integer> list = Arrays.asList(result1);

            System.out.println("The normal list is: " + list);
        } catch (NullPointerException e) {

            System.out.println("Exception thrown : " + e);
        }
        System.out.println("Testing even numbers list");
        System.out.println("Even numbers list is" + Arrays.toString(new List[]{result}));

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

}
