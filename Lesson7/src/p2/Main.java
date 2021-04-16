package p2;

import p1.Address;
import p1.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recruit recruit = new Recruit(new Address("Беларусь", "Минск"), 45, "Александр", "male", "Генерал");
        System.out.println(recruit.getName());
        System.out.println(recruit.getRank());

        recruit.info();
        recruit.speak();

        //второй способ.
        Person newRecruit = new Recruit(new Address("Беларусь", "Минск"), 45, "Николай", "male", "рядовой");
        newRecruit.info();

        System.out.println((Person) newRecruit);

//        System.out.println(newRecruit.getRank()); так нельзя вызвать компилятор ругается
        newRecruit.speak();
        System.out.println(((Recruit) newRecruit).getRank()); //мы можем привести newRecruit к типу Recruit

        //персон расширяет класс рекрут, но не каждый человек может быть рекрутом
        Person person = new Person(new Address("Беларусь", "Минск"), 45, "Николай", "male");
        person.info();
        System.out.println(person.getName());
//        System.out.println(((Recruit) person).getRank()); //так нельзя

        List<Person> persons = new ArrayList<>();
        persons.add(recruit);
        persons.add(newRecruit);
        persons.add(person);
        print(persons);

        Person newRecruitStatic = new Recruit(new Address("Беларусь", "Минск"), 45, "Николай", "male", "рядовой");
        newRecruitStatic.personTest();//идет по сылке

        //полиморфиз, перегрузка методов
        print(recruit);
        print(person);
        print("Генерал", "sdfdsf");
    }

    private static void print(Person person) {
        System.out.println(person.getName());
    }

    private static void print(String person, String person2) {
        System.out.println(person);
    }

    private static void print(List<Person> persons) {
        for (Person person : persons) {
            if (person instanceof Recruit) {// проверить является ли персон рекрутом
                Recruit recruit = (Recruit) person;
                if (recruit.getName().equals("Александр")) {
                    recruit.setRank("прапорщик");
                }
                System.out.println(recruit);
            }
            System.out.println(person.getName() + " " + person.getAge());
        }
    }


}
