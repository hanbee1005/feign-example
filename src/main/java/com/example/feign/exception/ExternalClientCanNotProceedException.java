package com.example.feign.exception;

public class ExternalClientCanNotProceedException extends RuntimeException {
    public ExternalClientCanNotProceedException() { super(); }

    public ExternalClientCanNotProceedException(String message) {
        super(message);
    }

    public ExternalClientCanNotProceedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExternalClientCanNotProceedException(Throwable cause) {
        super(cause);
    }
}
