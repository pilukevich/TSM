package p6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car("бмв", "красный", 15000);
        carSet.add(car1);
        Car car2 = new Car("бмв", "красный", 5000);
        carSet.add(car2);
        Car car3 = new Car("бмв", "красный", 15000);
        carSet.add(car3);

        System.out.println(carSet);

        Map<Car, Car> map = new HashMap<>();
//        Set<Car> cars = map.keySet();
        map.put(car1, car1);
        map.put(car2, car2);
        map.put(car3, car3);
        System.out.println(map);

    }
}
