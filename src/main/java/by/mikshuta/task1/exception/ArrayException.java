package main.java.by.mikshuta.task1.exception;

public class ArrayException extends Exception {

    public ArrayException() {
        super();
    }

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(Exception exception) {
        super(exception);
    }

    public ArrayException(String message, Exception exception) {
        super(message, exception);
    }
}