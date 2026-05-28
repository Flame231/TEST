package org.example.testSpring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class ProductRepository {

    public List<String> getProducts(){
        return Arrays.asList("Ноутбук", "Телефон", "Наушники");
    }
}
