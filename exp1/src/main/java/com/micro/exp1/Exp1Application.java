package com.micro.exp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Exp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp1Application.class, args);
    }

}
