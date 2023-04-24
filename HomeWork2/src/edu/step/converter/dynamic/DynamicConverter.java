package edu.step.converter.dynamic;

import edu.step.converter.TempConverter;

import java.util.Scanner;

public class DynamicConverter
{
    public static void execute()
    {
        Scanner in = new Scanner(System.in);
        double amount;
        System.out.println("Enter amount to convert: ");
        amount = in.nextDouble();

        System.out.println(amount + "°F = " + TempConverter.convertToCelsius(amount) + "°C");
        System.out.println(amount + "°C = " + TempConverter.convertToFahrenheit(amount) + "°F");

    }
}
