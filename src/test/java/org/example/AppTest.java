package org.example;

import org.example.model.DiscountCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AppTest {
    @Test
    public void shouldCalculatePrice_WhenDataIsCorrect() {
        double basePrice = 100;
        int discountPercentage = 13;
        double result = basePrice - (basePrice / 100 * discountPercentage);
        double methodResult = DiscountCalculator.calculateFinalPrice(basePrice, discountPercentage);
        assertEquals(result, methodResult, 0.001);
    }

    @Test
    public void should_Throw_IllegalArgumentException_For_Base_Prise_When_BasePrice_is_Incorrect() {
        assertThrows("Тест на некорректную цену провален!!",
                IllegalArgumentException.class,
                () -> DiscountCalculator.calculateFinalPrice(0, 13));
    }

    @Test
    public void should_Throw_IllegalArgumentException_For_DiscountPercentage_When_DiscountPercentage_is_Incorrect() {
        assertThrows("Тест на некорректную скидку провален!!",
                IllegalArgumentException.class,
                () -> DiscountCalculator.calculateFinalPrice(15, -2));
    }

    @Test
    public void shouldCalculate80PercentageOnly_when_DiscountPercentage_more_than_80() {
        double basePrice = 80;
        int discountPercentage = 82;
        assertEquals(basePrice - (basePrice / 100.0 * 80),
                DiscountCalculator.calculateFinalPrice(basePrice, discountPercentage), 0.001);
    }
}
