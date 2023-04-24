package edu.step.converter;

public class TempConverter
{
    public static double convertToCelsius(double amount)
    {
        return ((amount - 32) * 5) / 9;
    }

    public static double convertToFahrenheit(double amount)
    {
        return ((amount * 9) / 5) + 32;
    }
}
