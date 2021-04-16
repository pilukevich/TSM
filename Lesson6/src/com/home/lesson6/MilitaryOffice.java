package com.home.lesson6;

import java.util.Arrays;
import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public PersonRegistry getPersonRegistry() {
        return personRegistry;
    }

    public void setPersonRegistry(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void info() {
        System.out.println(Arrays.toString(personRegistry.getPersons()));
    }

    public int getCountOfPersonByAddress(Address address) {
        List<Person> people = personRegistry.getPeople(address);
//        System.out.println(people);
        return people.size();
    }

    public int getCountOfPersonWithNameAlexander(String name) {
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    //взять у регистратуры людей и пробежать по ним и найти людей годных к службе
    public int getPersonsByParams() {
        return 0;
    }
}
