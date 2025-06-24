package com.ntu.interfacetutorial.ex71;

public class TestCustomer {
    public static void main(String[] args) {
        var customer = new Customer("Davethu");
        System.out.println(customer);
        customer.setMemberType("Premium");
        customer.setMember(true);
        System.out.println(customer);
    }
}
