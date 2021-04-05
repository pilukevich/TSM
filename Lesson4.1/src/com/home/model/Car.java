package com.home.model;

public class Car {
    String model;
    String color;

    //внутренний класс
    public class Engine {
        //доступ есть к полям
//        если магазин запчастей то надо отдельный класс

        //start stop
        //инициализация
    }

    public static class Panel {
        public void check() {
            System.out.println("check Engine");
        }
    }
}
