package com.tms.model;


import static com.tms.model.Constant.TEMP;

public class Main {
    public static void test() {

    }

    public static void main(String[] args) {
        int count = 1;
        long n = 3;

        String str = "kkkkk";
        str = null;


//        test();
//        System.out.println(Person.CC);
        Person person = new Person(50, "Nikolai");
//        person.setAge(123);
        System.out.println(person);

        Car car = new Car();
        car.setColor("зеленый");
        car.setName("Мазда");
        System.out.println(car.getColor() + car.getName());
        car.setColor("красный");


//        person.age = 1;
//        person.name = "Mihail";
//        person.info();
//        System.out.println(person.CC);
//        person.COUNT = 5;
//        System.out.println(person.COUNT);
//        Person nikolai = new Person(2, "Nikolai");
//        nikolai.info();
//        System.out.println(nikolai.COUNT);


//        System.out.println(COUNT);

//
//
//        Person person1 = new Person(12);
//        Person temp = new Person(122, "temp");
//        check(temp);
    }

    static void check(Person person) {
        if (person.getName().equals(TEMP)) {
            System.out.println("мы нашли персон TEMP");
        }
    }
}
