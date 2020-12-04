package com.example.multdatasources.configure;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    public Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.get();
    }
}
