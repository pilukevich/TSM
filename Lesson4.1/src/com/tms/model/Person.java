package com.tms.model;


import com.tms.db.model.PersonDto;

public class Person {

    public static final String CC = "123";
    public static int COUNT = 0;

    int age;
    String name;
    int height;
    PersonDto personDto;

    public Person() {
        height = 200;
        System.out.println("Default");
        personDto = new PersonDto();
//        COUNT++;
    }

    public Person(int age, String name) {
        this(age);
        this.name = name;
        System.out.println("Person with name and age");
    }

    public Person(String name) {
        this.age = 180;
        this.name = "ll";
    }

    public Person(int age) {
        this();
        this.age = age;
        System.out.println("Person with age");
    }

    public void info() {
        System.out.println("Name " + name + " Age " + age);
    }

}
