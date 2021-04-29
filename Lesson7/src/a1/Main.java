package a1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        Speaker konstantin = new Person(konstantinsAddress, 20, "Konstantin", Person.MALE);
        konstantin.speak();

        List<Speaker> speakers = new ArrayList<>();
        speakers.add(konstantin);
        speakers.add(new Cat());
        speakers.add(new Dog());
        makeIfo(speakers);

        SpeakerService speakerService = new SpeakerService();
        speakerService.makeSpeakerSpeak(konstantin);

        PersonRegistry personRegistry = new PersonRegistry(null);
        personRegistry.list();
        personRegistry.list(new Address("", ""));
    }

    static void makeIfo(List<Speaker> speakers) {
        for (Speaker speaker : speakers) {
            speaker.speak();
        }
    }
}
