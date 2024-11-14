package com.arch.filter;

import com.arch.config.Config;

import java.util.List;

/**
 * @author shaco
 */
public interface Filter<T> {

    Config config = null;
    Filter next = null;

    /**
     * Apply the filter
     *
     * @param group the list of items to be filtered
     * @return the result list
     */
    List<T> execute(List<T> group);

    /**
     * Handle the filtered list asynchronously
     *
     * @param filteredGroup the list of filtered items
     * @return void
     */
    void handle(List<T> filteredGroup);
}