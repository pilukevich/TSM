package homework;

import lombok.Getter;
import lombok.Setter;

/**
 * Паттерн проектирования Builder.
 * https://vertex-academy.com/tutorials/ru/pattern-builder-java/
 * Этот шаблон рекомендуется использовать,
 * когда класс имеет большое количество однотипных параметров и трудно запомнить их порядок и назначение.
 * Например StringBuilder из java&
 */

@Getter
@Setter
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private int age;

        PersonBuilder() {
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }

        public String toString() {
            return "Person.PersonBuilder(name=" + this.name + ", age=" + this.age + ")";
        }
    }
}
