package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControl {

    @GetMapping
    public String main() {
        return "Hello Alex. This is auto deploy with docker compose!!! CI/CD";
    }
}
