package com.example;
import org.springframework.boot.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //I am from local
        SpringApplication.run(Application.class, args);
    }

}
