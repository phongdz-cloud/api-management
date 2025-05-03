package com.example.app.exception;

public class SecurityException extends RuntimeException {
    private final String errorCode;
    private final String errorMessage;

    public SecurityException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
} 