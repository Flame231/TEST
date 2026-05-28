package org.example;

import lombok.Builder;

@Builder
public class PaymentProcessor {
    private String apiKey;
    private double commission;

    public void processPayment(double amount) {
        double total = amount + (amount * commission / 100);
        System.out.println("Оплата" + " комиссия " + commission + " %= " + total);
    }
}
