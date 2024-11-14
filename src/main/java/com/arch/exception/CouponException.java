package com.arch.exception;

/**
 * @author shaco
 */
public class CouponException extends RuntimeException{
    public CouponException() {
    }

    public CouponException(String message) {
        super(message);
    }
}