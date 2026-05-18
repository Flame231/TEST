package org.example.model;

public class DiscountCalculator {
    public static double calculateFinalPrice(double basePrice, int discountPercentage) {

        if(basePrice>0){
            if (discountPercentage < 80 && discountPercentage >= 0) {
                return basePrice - (basePrice / 100 * discountPercentage);
            } else if (discountPercentage >= 80) {
                return basePrice - (basePrice / 100 * 80);

            } else {
                throw new IllegalArgumentException("Указана неверная скидка!");
            }
        }
        else{
            throw new IllegalArgumentException("Указана неверная цена!");
        }

    }
}
