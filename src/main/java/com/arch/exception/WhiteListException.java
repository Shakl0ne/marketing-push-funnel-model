package com.arch.exception;

/**
 * @author shaco
 */
public class WhiteListException extends RuntimeException{
    public WhiteListException() {
    }

    public WhiteListException(String message) {
        super(message);
    }
}