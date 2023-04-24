package edu.step.calculator;

import java.util.Scanner;

public class CalculatorExecutor
{
    public static void execute()
    {
        Scanner in = new Scanner(System.in);
        double a, b;
        System.out.println("Enter a: ");
        a = in.nextDouble();
        System.out.println("Enter b: ");
        b = in.nextDouble();

        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Diff: " + Calculator.difference(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Division: " + Calculator.division(a, b));
    }
}
