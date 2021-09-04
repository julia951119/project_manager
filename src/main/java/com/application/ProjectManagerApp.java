package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
    public class ProjectManagerApp {


        public static void main(String[] args) {
            SpringApplication.run(ProjectManagerApp.class, args);
        }

    }

