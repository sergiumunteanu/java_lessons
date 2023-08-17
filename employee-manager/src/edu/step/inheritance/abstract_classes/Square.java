package edu.step.inheritance.abstract_classes;

import java.util.Scanner;

public class Square extends ShapeWithSides {

    public Square(String color) {
        super("Square", color);
    }

    public double calculatePerimeter() {
        double side = askUserInput("Introduceti latura patratului");
        return side * 4;
    }


    @Override
    public double calculateSurface() {
        return 0;
    }
}
