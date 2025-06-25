package com.ntu.moreexerciseonoop.ex71;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.20;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.10;
    private static final double productDiscountPremium = 0.10;
    private static final double productDiscountGold = 0.10;
    private static final double productDiscountSilver = 0.10;

    public static double getServiceDiscountRate(String type) {
        double sDiscount;
        switch (type) {
            case "Premium":
                sDiscount = serviceDiscountPremium;
                break;
            case "Gold":
                sDiscount = serviceDiscountGold;
                break;
            case "Silver":
                sDiscount = serviceDiscountSilver;
                break;
            default:
                sDiscount = 0.0;
        }
        return sDiscount;
    }

    public static double getProductDiscountRate(String type) {
        double pDiscount;
        switch (type) {
            case "Premium":
                pDiscount = productDiscountPremium;
                break;
            case "Gold":
                pDiscount = productDiscountGold;
                break;
            case "Silver":
                pDiscount = productDiscountSilver;
                break;
            default:
                pDiscount = 0.0;
        }
        return pDiscount;
    }

}
