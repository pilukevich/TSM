package com.home.lesson6;

public class Main {
    public static void main(String[] args) {
        int d = 0;
        Person[] persons = prepareData();
        PersonRegistry personRegistry = new PersonRegistry();
        personRegistry.setPersons(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        //вывести количество призывников у которых имя Александр.
        int countNameAlexander = militaryOffice.getCountOfPersonWithNameAlexander("Александр");
        System.out.println(countNameAlexander);

        int countOfPersonByAddress = militaryOffice.getCountOfPersonByAddress(new Address("Беларусь", "Минск"));
        System.out.println(countOfPersonByAddress);

        //дописать остальные методы
        militaryOffice.getPersonsByParams();


//        changeAddress(address);
//        System.out.println(address);
//        System.out.println(Arrays.toString(persons));


//        List<Person> personList = new ArrayList<>();
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//        for (Person person : personList) {
//            System.out.println(person);
//        }
    }

    private static Person[] prepareData() {
        Address address = new Address("Беларусь", "Минск");
        Address address2 = new Address("Беларусь", "Витебск");
        Person person1 = new Person("Alex", 23, "male", address);
        Person person2 = new Person("Николай", 19, "male", address2);
        Person person3 = new Person("Николай", 21, "male", address);
        Person[] persons = {person1, person2, person3};
        return persons;
    }

    static void changeAddress(Address address) {
        address.setCity("Гомель");
        System.out.println(address.getCity());
    }

}
