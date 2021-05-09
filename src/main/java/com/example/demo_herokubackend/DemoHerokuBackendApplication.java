package com.example.demo_herokubackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

@SpringBootApplication
public class DemoHerokuBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHerokuBackendApplication.class, args);
    }

}


