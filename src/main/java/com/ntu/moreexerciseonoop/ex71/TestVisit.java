package com.ntu.moreexerciseonoop.ex71;

import java.util.Date;

public class TestVisit {
    public static void main(String[] args) {
        var customer = new Customer("Davethu");
        System.out.println(customer);
        customer.setMemberType("Premium");
        customer.setMember(true);
        System.out.println(customer);

        String cType = customer.getMemberType();

        var visit = new Visit(customer.getName(), new Date());
        System.out.println(visit);
        visit.setServiceExpense(1000);
        System.out.println(visit.getServiceExpense());
        visit.setProductExpense(5000);
        System.out.println(visit.getProductExpense());
        double sDiscount=0.0;
        double pDiscount=0.0;
        if (customer.isMember()) {
            sDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
            pDiscount = DiscountRate.getProductDiscountRate(customer.getMemberType());
        }
        System.out.println(sDiscount);
        System.out.println(pDiscount);


    }


}
