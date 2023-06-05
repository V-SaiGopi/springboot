package com.example.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.react")
@EnableJpaRepositories("com.example.react")
@EntityScan("com.example.react")
public class ReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactApplication.class, args);
    }

}
