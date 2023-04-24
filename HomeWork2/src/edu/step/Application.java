package edu.step;

import edu.step.calculator.CalculatorExecutor;
import edu.step.comparator.ComparatorExecutor;
import edu.step.converter.TempConverter;
import edu.step.converter.dynamic.DynamicConverter;

public class Application {
    public static void main(String[] args)
    {
        //1.
        System.out.println("Conversia temperaturii (static)");
        double amount = 100;
        System.out.println(amount + "°F = " + TempConverter.convertToCelsius(amount) + "°C");
        System.out.println(amount + "°C = " + TempConverter.convertToFahrenheit(amount) + "°F");

        //2.
        System.out.println("Conversia temperaturii (dinamic)");
        DynamicConverter.execute();

        //3.
        System.out.println("Calcul aritmetic");
        CalculatorExecutor.execute();

        //4.
        System.out.println("Compararea numerelor");
        ComparatorExecutor.execute();

        /*
        * Electrocasnice
        * - Categorie
        * - Brand
        * - Catalog
        * - Produse
        * - Vanzator
        * Mobila
        * - Furnizor
        * - Livrator
        * - Material
        * - Mobila
        * - Client
        * Profesii
        * - Profesii
        * - Categorii
        * - Angajati
        * - Institutii
        * - Regiuni
        * Transport
        * - Models (bmw)
        * - Types (auto, camion)
        * - Countries
        * - Color
        * - Cars
        * Blog
        * - Category
        * - Article
        * - User
        * - Image
        * - Banner
        * */

    }
}
