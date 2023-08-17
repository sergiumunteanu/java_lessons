package edu.step.inheritance.abstract_classes;

public class Triangle extends ShapeWithSides{
    public Triangle(String color) {
        super("Triangle", color);
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateSurface() {
        return 0;
    }
}
