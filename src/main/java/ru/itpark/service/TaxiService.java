package ru.itpark.service;

public class TaxiService {
    public int cost (int routeDistance){
        int taxiBoarding = 60;
        int costPerKilometer = 20;
        int tripAmountForDiscounts = 1_000;
        int discountPercent = 5;
        int maxDiscountRuble = 100;
        int result = taxiBoarding + costPerKilometer * routeDistance;
        int tripDiscount;
        if (result > tripAmountForDiscounts) {
            tripDiscount = result * discountPercent / 100;
            if (tripDiscount > maxDiscountRuble) {
                tripDiscount = maxDiscountRuble;
            }
            result = result - tripDiscount;
        }
        return result;
    }
}

