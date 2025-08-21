package com.headfirst.ch9;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Initialize name and price and default quantity to zero
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Initialize all fields
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Product created: " + name);
    }

    public void productDetails() {
        System.out.println("Name: " + name + " Price: RM" + price + " Quantity: " + quantity);
    }

    public static void main(String[] args) {

        // Using constructor 1
        Product laptop = new Product("Laptop", 1999);
        laptop.productDetails();

        // Using constructor 2
        Product mouse = new Product("Mouse", 25.50, 99);
        mouse.productDetails();
    }
}

