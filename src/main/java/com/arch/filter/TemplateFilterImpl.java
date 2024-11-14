package com.arch.filter;



import com.arch.config.TemplateConfig;
import com.arch.exception.TemplateException;

import java.util.List;

/**
 * @author shaco
 */
public class TemplateFilterImpl implements Filter {

    TemplateConfig config;
    Filter next;

    @Override
    public List execute(List group) throws TemplateException {
        return List.of();
    }

    @Override
    public void handle(List filters) {
    }
}
