package com.composition;

public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int quantity;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
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

    @Override
    public String toString() {
        return String.format("Book[name=%s,%s,price=%.2f,quantity=%d]", name, author, price, quantity);
    }
}
