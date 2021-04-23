package p1;

public class DogIsNotReadyException extends RuntimeException {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
