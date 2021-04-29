package p2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Test");
        System.out.println(p1);
        Person p2 = new Person("Test", 12);

        p2 = p1;
        p2 = new Person(p1.getName(), p1.getAge());
        p1.setName("Николай");
        System.out.println(p1);
        System.out.println(p2);


//        Person2 personNext = new Person2("Test");

//        System.out.println(personNext.hashCode() == p1.hashCode());
//        System.out.println(personNext.equals(p1));//

        System.out.println("a1 " + p1.hashCode());
        System.out.println("p2 " + p2.hashCode());

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1 == p2);//сылка


//        Person p3 = null;
//        System.out.println(p1.equals(p3));

        Person alex = new Person("Alex", 35);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Николай", 23));
        persons.add(new Person("Alex", 23));
        persons.add(alex);

        for (Person person : persons) {
            if (person.getAge() == alex.getAge() && person.getName().equals(alex.getName())) {
                System.out.println("yes");
            }
            if (person.equals(alex)) {
                System.out.println("yes");
            }
        }

        System.out.println(persons.contains(alex));//содержится ли


        if (p1.equals(p2)) {
            System.out.println("p1 equals p2");
        } else {
            System.out.println("p1 not equals p2");
        }

        if (p1 == p2) {
            System.out.println("!!!");
        } else {
            System.out.println("1111");
        }

        int k = 5;
        if (k == 5) {
            System.out.println(true);
        }
    }
}
