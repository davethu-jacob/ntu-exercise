package com.ntu.composition.ex22;

import com.ntu.composition.ex21.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int quantity;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        String listOfAuthors = "";
        String temp = "";
        for (int i=0; i < authors.length; i++) {
            temp = String.format ("[name=%s,email=%s,gender=%c]", authors[i].getName(),
                    authors[i].getEmail(), authors[i].getGender());
            listOfAuthors += temp;
            if (i + 1 < authors.length)
                listOfAuthors = listOfAuthors + ",";
        }
        return String.format ("Book[name=%s,authors={Author%s},price=%.2f,quantity=%d]", name, listOfAuthors, price, quantity);

    }

}
