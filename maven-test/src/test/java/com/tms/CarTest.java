package com.tms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * https://www.vogella.com/tutorials/JUnit/article.html
 */
class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() throws Exception {
        car = new Car("бмв", "красный", new BigDecimal(35000));
    }

    @Test
    @DisplayName("Проверка метода toString")
    void testToString() {
        String expected = "Car(name=бмв, color=красный, price=35000)";
        Assertions.assertEquals(expected, car.toString());
    }
}