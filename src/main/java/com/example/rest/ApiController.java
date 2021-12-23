package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@RestController
public class ApiController {

    @GetMapping
    public LocalDateTime getZonedDateTime() {
        return LocalDateTime.now();
    }
}
