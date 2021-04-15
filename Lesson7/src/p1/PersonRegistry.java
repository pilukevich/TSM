package p1;

import java.util.ArrayList;
import java.util.List;

/**
 * надо думать интерфейсами и заварачивать все в интерфейсы
 * если есть база то или файл или из интерента
 * а PersonDao имеет только те методы которые мы используем в коде, реализация нам не важна.
 */
public class PersonRegistry implements PersonDao {

    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    @Override
    public List<Person> list() {
        return null;
    }

    @Override
    public List<Person> list(Address address) {
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
