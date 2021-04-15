package com.home.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private Person[] persons;

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public List<Person> getPeople(Address address) {
        List<Person> people = new ArrayList<>();
        for (Person person : persons) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        return people;
    }

}
