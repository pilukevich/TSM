package a1;

public class DogIsNotReadyException extends RuntimeException {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
