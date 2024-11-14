package com.arch.filter;

import com.arch.config.NLabelConfig;
import com.arch.exception.NLabelException;

import java.util.List;

/**
 * @author shaco
 */
public class NLabelFilterImpl implements Filter {

    NLabelConfig config;
    Filter next;

    @Override
    public List execute(List group) throws NLabelException {
        return List.of();
    }

    @Override
    public void handle(List filters) {
    }
}
