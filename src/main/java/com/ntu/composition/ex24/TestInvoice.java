package com.ntu.composition.ex24;

public class TestInvoice {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "NCR Malaysia", 8);
        System.out.println(customer);

        Invoice invoice = new Invoice(1, customer, 999.90);
        System.out.println(invoice);
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
