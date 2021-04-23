package homework.clothes;

import java.util.List;

public class Person {
    private String name;
    private List<Clothes> clothesList;

    public Person(String name, List<Clothes> clothesList) {
        this.name = name;
        this.clothesList = clothesList;
    }

    public void getDressed() {
        for (Clothes clothes : clothesList) {
            clothes.putOn();
        }
    }

    public void undress() {
        for (Clothes clothes : clothesList) {
            clothes.takeOff();
        }
    }
}
