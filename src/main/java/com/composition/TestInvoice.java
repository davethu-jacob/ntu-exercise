package com.composition;

public class TestInvoice {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Davethu", 10);
        System.out.println(c1);

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(5000);
        System.out.println(inv1);
        System.out.println("invoice id is: " + inv1.getId());
        System.out.println("customer details: " + inv1.getCustomer());
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer id is: " + inv1.getCustomerId());
        System.out.println("customer name is: " + inv1.getCustomerName());
        System.out.println("customer discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount: %,.2f", inv1.getAmountAfterDiscount());
    }
}
