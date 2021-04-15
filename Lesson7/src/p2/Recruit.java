package p2;

import lombok.Getter;
import lombok.Setter;
import p1.Address;
import p1.Person;

/**
 * Наследование. Recruit(военослужащий) - потомок, Person - класс родитель
 */
@Getter
@Setter
public class Recruit extends Person { //final -запрещает наследование
    private String rank; // есть что то свое(данные методы) в отличии от родителя
//    private Address address;
//    private int age;
//    private String name;
//    private String sex = FEMALE;


    public Recruit(Address address, int age, String name, String sex, String rank) {
        super(address, age, name, sex);
        this.rank = rank;
    }

//    @Override
//    public void info() {
//        System.out.println("Recruit");
//    }

    public static void personTest() {
        System.out.println("static Recruit test");
    }

    /**
     * только public и protected методы можно переопределять
     * final - нельзя переопределить метод в наследнике
     */
    @Override
    public void speak() {//переопределили метод(рекруты будут разговаривать по другому)
        System.out.println("Здравия желаю!!");
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "rank='" + rank + '\'' +
                "name" + super.getName() +
                '}';
    }
}
