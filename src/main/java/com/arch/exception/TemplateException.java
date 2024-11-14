package com.arch.exception;

/**
 * @author shaco
 */
public class TemplateException extends RuntimeException{
    public TemplateException() {
    }

    public TemplateException(String message) {
        super(message);
    }
}