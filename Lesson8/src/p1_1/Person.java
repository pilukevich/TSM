package p1_1;

public class Person {//final - запрещает наследование
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    void info() {
        System.out.println("Person");
    }
}
