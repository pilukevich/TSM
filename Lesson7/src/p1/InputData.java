package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    private final Scanner scanner = new Scanner(System.in);

    public List<Person> getGeneratedPersons() {
        List<Person> personList = new ArrayList<>();
        int personNumbers = getEnterPersonNumbers();
        for (int i = 0; i < personNumbers; i++) {
            Person person = new Person();
            enterName(person);
            enterAge(person);
            enterSex(person);
            enterCountryAndCity(person);
            personList.add(person);
        }
        return personList;
    }

    private int getEnterPersonNumbers() {
        System.out.println("Введите число, которое будет соответсвовать количеству людей: ");
        return scanner.nextInt();
    }

    private void enterName(Person person) {
        System.out.println("Введите имя: ");
        person.setName(scanner.next());
    }

    private void enterAge(Person person) {
        System.out.println("Введите возрвст: ");
        person.setAge(Integer.parseInt(scanner.next()));
    }

    private void enterSex(Person person) {
        System.out.println("Введите пол: ");
        person.setSex(scanner.next());
    }

    private void enterCountryAndCity(Person person) {
        System.out.println("Введите страну и город через пробел: ");
        Address address = new Address(scanner.next(), scanner.next());
        person.setAddress(address);
    }

}
