package com.lms.exception;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String email) {
        super("Email address '" + email + "' already exists.");
    }
}