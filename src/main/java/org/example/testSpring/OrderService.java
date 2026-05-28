package org.example.testSpring;

import org.example.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentProcessor paymentProcessor;
    private ProductService service;
    public OrderService(ProductService service, PaymentProcessor paymentProcessor) {
        this.service = service;
        this.paymentProcessor = paymentProcessor;
    }

    public void print() {
        service.printProductr();
        System.out.println("Заказ создан " + service.toString());
        paymentProcessor.processPayment(100);
    }
}
