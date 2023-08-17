package edu.step.inheritance.abstract_classes;

import edu.step.inheritance.Auto;

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square("blue");
        System.out.println(sq.calculatePerimeter());
        Circle circle = new Circle("red");
        System.out.println(circle.calculatePerimeter());
//        double x = Auto.value + 15;
//        Shape shape = new Shape();
//        System.out.println(shape.calculatePerimeter());
    }
}
