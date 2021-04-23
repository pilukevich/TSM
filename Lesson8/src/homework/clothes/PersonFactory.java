package homework.clothes;

import homework.bodyWear.BodyWear;
import homework.bodyWear.Jacket;
import homework.bodyWear.Slicker;
import homework.footWear.*;
import homework.legWear.Jeans;
import homework.legWear.Kilt;
import homework.legWear.LegWear;
import homework.legWear.Shorts;

import java.util.ArrayList;

public class PersonFactory {
    private static int continuousSeed;


    public static void main(String[] args) {
        System.out.println(Names.ARKADY);//русскими
        System.out.println(Names.ARKADY.toString());//сылка ARKADY
        System.out.println(Names.ARKADY.getMyName());//ARKADY
        System.out.println(Season.AUTUMN.name());
    }


    public Person createPerson() {
//        Random random = new Random();
//        int randomIndex = random.nextInt(Names.values().length);

        int numberOfName = continuousSeed % Names.values().length;
        System.out.println(Names.ARKADY.name());

        String personName = Names.values()[numberOfName].toString();
        ArrayList<Clothes> clothesList = new ArrayList<>();
        clothesList.add(choseBodyWear(continuousSeed));
        clothesList.add(choseLegWear(continuousSeed));
        clothesList.add(choseFootWear(continuousSeed));
        Person result = new Person(personName, clothesList);
        continuousSeed++;
        return result;
    }

    public Person createPerson(int randomSeed) {
        int numberOfName = randomSeed % Names.values().length;
        String personName = Names.values()[numberOfName].toString();
        return null;
//        return new Person(personName, choseBodyWear(randomSeed), choseLegWear(randomSeed), choseFootWear(randomSeed));
    }

    private BodyWear choseBodyWear(int itemChoice) {
        switch (itemChoice % BodyWear.TYPES) {
            case 0:
                return new Jacket();
            case 1:
                return new Slicker();
            default:
                throw new IllegalStateException("Unexpected value: " + itemChoice % BodyWear.TYPES);
        }
    }

    private LegWear choseLegWear(int itemChoice) {
        switch (itemChoice % LegWear.TYPES) {
            case 0:
                return new Jeans();
            case 1:
                return new Kilt();
            case 2:
                return new Shorts();
            default:
                throw new IllegalStateException("Unexpected value: " + itemChoice % LegWear.TYPES);
        }
    }

    private FootWear choseFootWear(int itemChoice) {
        switch (itemChoice % FootWear.TYPES) {
            case 0:
                return new Boots();
            case 1:
                return new Gumshoes();
            case 2:
                return new Slippers();
            case 3:
                return new Sneakers();
            default:
                throw new IllegalStateException("Unexpected value: " + itemChoice % FootWear.TYPES);
        }
    }
}
