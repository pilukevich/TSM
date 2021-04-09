package com.tms.db.model;

public class PersonDto {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Name " + name + "Age " + age;
    }
}
