package com.arch.filter;

import com.arch.config.BlackListConfig;
import com.arch.exception.BlackListException;

import java.util.List;

/**
 * @author shaco
 */
public class BlackListFilterImpl implements Filter {

    BlackListConfig config;
    Filter next;

    public BlackListFilterImpl(BlackListConfig config) {
        this.config = config;
    }

    @Override
    public List execute(List group) throws BlackListException {
        return List.of();
    }

    @Override
    public void handle(List filters) {
    }
}
