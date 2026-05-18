package org.example.model;

public class IncorrectNumberException extends RuntimeException {
    public IncorrectNumberException(String message) {
        super(message);
    }
}
