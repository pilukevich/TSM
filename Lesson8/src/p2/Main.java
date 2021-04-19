package p2;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Viber();
//        messenger.sendMessage();
//        messenger.getMessage();

        Client client = new Client(messenger);
        client.info();
//        Messenger clientMessenger = client.getMessenger();
//        clientMessenger.sendMessage();
//        clientMessenger.getMessage();
    }
}
