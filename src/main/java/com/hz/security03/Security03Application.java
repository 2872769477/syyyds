package com.hz.security03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class Security03Application {

    public static void main(String[] args) {
        SpringApplication.run(Security03Application.class, args);
    }

}
