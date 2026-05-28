package org.example.testSpring;

import lombok.ToString;
import org.springframework.stereotype.Component;
@ToString
@Component
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void printProductr(){
        System.out.println("Товары" + repository.getProducts());
    }
}
