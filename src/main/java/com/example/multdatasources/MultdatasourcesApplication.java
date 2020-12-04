package com.example.multdatasources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MultdatasourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultdatasourcesApplication.class, args);
    }

}