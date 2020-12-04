package com.example.multdatasources.controller;

import com.example.multdatasources.dao.UserMapper;
import com.example.multdatasources.entity.User;
import com.example.multdatasources.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/master")
    public List<User> helloMaster(){
        return testService.masterSelect();
    }

    @GetMapping("/slave")
    public List<User> helloSlave(){
        return testService.slaveSelect();
    }
}
