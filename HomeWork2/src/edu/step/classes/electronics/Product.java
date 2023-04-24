package edu.step.classes.electronics;

public class Product {
    int id;
    String name;
    String description;
    double price;

    public double salePrice(int percent){
        return price - ((price * percent) / 100);
    }
}
