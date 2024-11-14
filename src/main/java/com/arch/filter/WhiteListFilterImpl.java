package com.arch.filter;

import com.arch.config.WhiteListConfig;
import com.arch.exception.WhiteListException;

import java.util.List;

/**
 * @author shaco
 */
public class WhiteListFilterImpl implements Filter {

    WhiteListConfig config;
    Filter next;

    public WhiteListFilterImpl(WhiteListConfig config) {
        this.config = config;
    }

    @Override
    public List execute(List group) throws WhiteListException {
        return List.of();
    }

    @Override
    public void handle(List filters) {
    }
}
