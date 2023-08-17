package edu.step.inheritance.abstract_classes;

import java.util.Scanner;

public class Circle extends Shape {

    public Circle(String color) {
        super("Circle", color);
    }

    public double calculatePerimeter() {
        double radius = askUserInput("Introduceti raza cercului");
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSurface() {
        return 0.0;
    }
}
