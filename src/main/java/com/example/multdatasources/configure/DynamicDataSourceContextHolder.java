package com.example.multdatasources.configure;

import com.example.multdatasources.enumFile.DataSourceKey;

/*
 *  线程保持数据库链接文件
 */
public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<DataSourceKey> currentDatesource = new ThreadLocal<>();

    //获取当前链接文件
    public static Object get(){
        return currentDatesource.get();
    }

    //消除当前链接
    public static void remove(){
        currentDatesource.remove();
    }

    //设置当前链接
    public static void set(DataSourceKey value) {
        currentDatesource.set(value);
    }
}
