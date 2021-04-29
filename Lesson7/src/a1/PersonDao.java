package a1;

import java.util.List;

/**
 * методы list получают людей, но от куда он будет получать данные это будет зависеть
 * от того кто будет реализовывать данный интерфейс
 */
public interface PersonDao {
    int LIMIT = 100;//public static final по умолчанию

    List<Person> list();

    List<Person> list(Address address);
}
