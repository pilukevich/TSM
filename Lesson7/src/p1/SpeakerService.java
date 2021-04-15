package p1;

public class SpeakerService {
    /**
     * Объединяем функционал интерфесом, чтобы не плодить кучу методов
     * предпологаем что есть общее поведение, но представляете что реализаций будет много.
     *
     * @param speaker - интерфейс
     */
    public void makeSpeakerSpeak(Speaker speaker) {
        speaker.speak();
    }

//    public void makeDogSpeak(Dog speaker) {
//        speaker.speak();
//    }
//    public void makeCatSpeak(Cat speaker) {
//        speaker.speak();
//    }
}
