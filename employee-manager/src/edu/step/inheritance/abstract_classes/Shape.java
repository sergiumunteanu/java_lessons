package edu.step.inheritance.abstract_classes;

import java.util.Scanner;

public abstract class Shape {

    private static int count = 0;
    protected String name;
    protected String color;

    protected int x;
    protected int y;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateSurface();

    public double askUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        double radius = scanner.nextDouble();
        return radius;
    }

    public void move(int x, int y) {

    }

    public static void main(String[] args) {

    }


}
