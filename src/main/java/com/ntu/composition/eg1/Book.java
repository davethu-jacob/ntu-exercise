package com.ntu.composition.eg1;

public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int quantity;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,%s,price=%.2f,quantity=%d]", name, author, price, quantity);
    }
}
