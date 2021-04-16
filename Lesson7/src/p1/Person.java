package p1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Person implements Speaker {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private Address address;
    private int age;
    private String name;
    private String sex = FEMALE;

    public Person(Address address, int age, String name, String sex) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Person() {

    }

    public static void personTest() {
        System.out.println("static personTest");
    }

    public void info() {
        System.out.println("Person");
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }

    /**
     * имплементируем метод спик от интерфейса Speaker.
     */
    @Override
    public void speak() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }
}
