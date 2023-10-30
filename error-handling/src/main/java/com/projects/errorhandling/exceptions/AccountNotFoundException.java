package com.projects.errorhandling.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AccountNotFoundException extends ResponseStatusException {

    private static final HttpStatus STATUS = HttpStatus.NOT_FOUND;
    private static final String DEFAULT_MESSAGE = "Account not found against this id";

    public AccountNotFoundException() {
        super(STATUS, DEFAULT_MESSAGE);
    }

    public AccountNotFoundException(String message) {
        super(STATUS, message);
    }
}

