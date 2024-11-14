package com.arch;

import com.arch.config.Config;
import com.arch.filter.*;
import com.arch.form.FilterForm;

import java.util.List;
import java.util.Map;

public class Processor<T> {

    Filter head;

    void init(List<FilterForm> filters) {
        for (int i = 0; i < filters.size(); i++) {
            Filter newFilter = getFilter(filters.get(i).getCode());
            newFilter.set
        }
    }

    List<T> entry(List<T> group) {
        return group;
    }

    private Filter getFilter(Integer code, Config config) {
        switch (code) {
            case 1:
                return new WhiteListFilterImpl();
            case 2:
                return new BlackListFilterImpl();
            case 3:
                return new NLabelFilterImpl();
            case 4:
                return new CouponFilterImpl();
            case 5:
                return new TemplateFilterImpl();
            default:
                return null;
        }
    }
}
