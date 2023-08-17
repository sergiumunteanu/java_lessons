package edu.step.inheritance.abstract_classes;

public abstract class ShapeWithSides extends Shape {

    public ShapeWithSides(String name, String color) {
        super(name, color);
    }

    public int getNumberOfSides(){
        return 0;
    };
}
