package com.arch.filter;



import com.arch.config.CouponConfig;
import com.arch.exception.CouponException;

import java.util.List;

/**
 * @author shaco
 */
public class CouponFilterImpl implements Filter {

    CouponConfig config;
    Filter next;

    public CouponFilterImpl(CouponConfig config) {
        this.config = config;
    }

    @Override
    public List execute(List group) throws CouponException {
        return List.of();
    }

    @Override
    public void handle(List filters) {
    }
}
