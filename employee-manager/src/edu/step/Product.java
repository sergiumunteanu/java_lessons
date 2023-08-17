package edu.step;

public class Product {

    private String name;
    private String description;
    private double price;
    private double weight;
    private Company company;
    private String qualityCertificateNumber = "QTY-63487837485";
    private int quantity; // ??? Stock ???

    public Product(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }
}
