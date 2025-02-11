package model;

public class Product {
    private final int id;   // ID is a fixed attribute
    private String name;    // Product Name
    private double price;   // Product Price

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Get() Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
