package com.example.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CheckHealthController {
    @GetMapping("/health")
    public String checkHealth() {
        return "OK";
    }

    @GetMapping("/sum/{a}/{b}")
    public Integer CalculateSum(@PathVariable Integer a,@PathVariable Integer b) {
        return a + b;
    }
}
