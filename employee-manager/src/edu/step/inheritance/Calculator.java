package edu.step.inheritance;

public class Calculator {

    double sum(int a, int b, int c) {
        return a + b;
    }


    double sum(int a, int b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,2,3.0);
    }
}
