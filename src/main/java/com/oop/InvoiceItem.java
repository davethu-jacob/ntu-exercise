package com.oop;

public class InvoiceItem {
    private final String id;
    private final String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return String.format("InvoiceItem[id=%s,description=%s,quantity=%d,unitPrice=%.2f]", id, description,quantity,unitPrice);
    }
}
