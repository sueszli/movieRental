package at.ac.tuwien.qs.movierental.exceptions;

public class NoMovieFoundException extends Exception {
    public NoMovieFoundException(String message) {
        super(message);
    }

    public NoMovieFoundException() {
        super();
    }

    public NoMovieFoundException(Throwable t) {
        super(t);
    }
}