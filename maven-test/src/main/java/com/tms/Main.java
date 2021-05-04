package com.tms;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! maven");

        System.out.println("Проверка работы ломбока");
        Car car = new Car("бмв", "красный", new BigDecimal(35000));
        System.out.println(car);
    }
}
