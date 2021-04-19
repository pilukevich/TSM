package p2;

public class Telegram implements Messenger {
    /**
     * методы сами не пишем только гереним с помощью идеи.
     */
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram!");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение из Telegram!");
    }
}
