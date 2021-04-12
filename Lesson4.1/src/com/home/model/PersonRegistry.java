package com.home.model;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private Person[] citizens;// граждане

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public int countPeople(Address address) { // количество людей проживающих по адрессу
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                count++;
            }
        }
        return count;
    }

    public int countPeople(String country) {//проживающий в стране
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(country)) {
                count++;
            }
        }
        return count;
    }

    public List<Person> getPeople(Address address) {//количество людей проживющих по адресу
        //можно ли с массивом сделать?
        List<Person> people = new ArrayList<>();
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        return people;
    }


}
