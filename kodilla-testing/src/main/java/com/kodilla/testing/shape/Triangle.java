package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final static String name = "Triagnle";
    private double side;
    private double hight;

    public Triangle(double side, double hight) {
        this.side = side;
        this.hight = hight;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (side*hight)/2;
    }

    public double getSide() {
        return side;
    }

    public double getHight() {
        return hight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.side, side) != 0) return false;
        return Double.compare(triangle.hight, hight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
