package com.ca.numberoperations.exceptions;

public class LimitException extends RuntimeException{

    private static final long serialVersionUID = -8460356990632230194L;

    public LimitException() {
        super();
    }

    public LimitException(String message) {
        super(message);
    }
}
