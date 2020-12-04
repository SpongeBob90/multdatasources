package com.example.multdatasources.aop;

import com.example.multdatasources.enumFile.DataSourceKey;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TargetSource {
    DataSourceKey dataSourceKey();
}