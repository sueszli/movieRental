package at.ac.tuwien.qs.movierental.exceptions;

public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException() {
        super();
    }

    public ValidationException(Throwable t) {
        super(t);
    }
}