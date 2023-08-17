package edu.step.inheritance;

import edu.step.inheritance.abstract_classes.Circle;
import edu.step.inheritance.abstract_classes.Shape;
import edu.step.inheritance.abstract_classes.Square;
import edu.step.inheritance.abstract_classes.Triangle;

public class Main {

    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
//        v1.name = "Toyota";
//        v1.veryComplicatedMethod();
////        v1.autoRunning(); // Does not work! Clasa vehicle nu are asa metoda
//
//        Auto a1 = new Auto();
//        a1.name = "Mazda";
//        a1.veryComplicatedMethod();
//        a1.autoRunning();
//
//        Auto a = new Vehicle();
//        a.autoRunning();
//
//        Vehicle v2 = new Auto();
//        v2.name = "Mercedes";
//        v2.veryComplicatedMethod();

        int[] x = new int[10];

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("red");
        shapes[1] = new Circle("blue");
        shapes[2] = new Triangle("white");
        for(Shape sh: shapes){
            sh.calculatePerimeter();
            sh.calculateSurface();
            sh.move(100, 300);
        }


//        Shape sq = new Square("red");
//        sq.calculatePerimeter();
//        sq.calculateSurface();
//        sq.move(100, 300);
//        Shape c = new Circle("blue");
//        c.calculatePerimeter();
//        c.calculateSurface();
//        c.move(150, 300);
//        Shape t = new Triangle("white");
//        t.calculatePerimeter();
//        t.calculateSurface();
//        t.move(200, 300);

    }

}
