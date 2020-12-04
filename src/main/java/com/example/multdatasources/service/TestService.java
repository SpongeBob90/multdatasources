package com.example.multdatasources.service;

import com.example.multdatasources.aop.TargetSource;
import com.example.multdatasources.dao.UserMapper;
import com.example.multdatasources.entity.User;
import com.example.multdatasources.enumFile.DataSourceKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private UserMapper userMapper;

    @TargetSource(dataSourceKey = DataSourceKey.DB_MASTER)
    public List<User> masterSelect(){
        return userMapper.listAll();
    }

    @TargetSource(dataSourceKey = DataSourceKey.DB_salve)
    public  List<User> slaveSelect(){
        return userMapper.listAll();
    }

}
