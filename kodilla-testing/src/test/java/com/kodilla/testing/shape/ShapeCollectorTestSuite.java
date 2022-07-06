package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestCircle {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);

            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeColector().size());
        }

        @Test
        void testGetFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(9);

            //When
            Shape result = shapeCollector.getFiugre(0);

            //Then
            assertNull(result);
        }
    }

    @Nested
    @DisplayName("Tests for Triangle")
    class TestTriagnle {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4, 5);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeColector().size());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4, 2);
            shapeCollector.addFigure(shape);

            //When
            Shape result = shapeCollector.getFiugre(0);

            //Then
            Assertions.assertEquals(shape, result);
        }
    }

    @Nested
    @DisplayName("Tests for Square")
    class TestSquare {
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(6);
            shapeCollector.addFigure(shape);

            //When
            Shape shape1 = new Square(5);
            boolean result = shapeCollector.removeFigure(shape1);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeColector().size());
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(7);
            Shape shape1 = new Triangle(8, 2);
            Shape shape2 = new Circle(11);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            shapeList.add(shape1);
            shapeList.add(shape2);

            //When
            List<Shape> resultList = shapeCollector.getShapeColector();

            //Then
            Assertions.assertEquals(shapeList.toString(), resultList.toString());
        }
    }
}
