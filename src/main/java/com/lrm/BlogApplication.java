package com.lrm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

    public static void main(String[] args) {

        System.out.print("b");
        SpringApplication.run(BlogApplication.class, args);
        System.out.print("end");
    }

    @Bean
    public CommandLineRunner run() {
        return (args) -> {
            throw new Exception("test");
        };
    }
}

