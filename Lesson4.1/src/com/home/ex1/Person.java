package com.home.ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends Test {
    public static final String MM = "Constanta";
    public String name; //характиристики, свойства
    public int age;
    public int height;

    @Override
    String getMyName() {
        return "Person";
    }

    //инициализатор
    {//static - инициализация статический контент(один раз работает)
        System.out.println("Start");
        //MM = "Constanta";
    }

    //конструктор после инициализатора
    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        this.height = 180;

    }

//    public Person(String name, int age, int height) {
//        this(name, age);
//        this.height = height;
//    }

    {
        age = 1; // устанавливает по умолчанию значение
        System.out.println("Init");
    }


    //поведение, способность дать информацию о себе
    void info() {
        System.out.println("Привет меня зовут " + name);
    }
}
