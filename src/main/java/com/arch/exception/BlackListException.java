package com.arch.exception;

/**
 * @author shaco
 */
public class BlackListException extends RuntimeException{
    public BlackListException() {
    }

    public BlackListException(String message) {
        super(message);
    }
}