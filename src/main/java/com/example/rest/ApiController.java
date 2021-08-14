package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class ApiController {

    @GetMapping
    public ZonedDateTime getZonedDateTime() {
        //I am from local
        //I am Deepak
        return ZonedDateTime.now();
    }
}
