package com.panyukovnn.gradlebasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradlebasicsController {

    @GetMapping("/")
    public String getGradlebasics() {
        return "Hello, from gradle basics project !";
    }
}
