package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeColector = new ArrayList<>();

    public List<Shape> getShapeColector() {
        return shapeColector;
    }

    public void addFigure(Shape shape) {
        shapeColector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeColector.remove(shape);
    }

    public Shape getFiugre(int n) {
        if (n >= 0 && n < shapeColector.size()) {
            return shapeColector.get(n);
        } else {
            return null;
        }
    }

        public void showFigures () {
            System.out.println(shapeColector.toString());
        }


    }
