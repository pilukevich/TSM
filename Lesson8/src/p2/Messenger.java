package p2;

/**
 * интерфейс это - можно сказать описание действий чего либо, как это будет реализовано нам не важно.
 */
public interface Messenger {
    String CC = "sdfd";//константа

    public void sendMessage();//public не нужен он по умолчанию(идея серым подсвечивает)

    void getMessage();
}
