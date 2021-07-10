package com.panyukovnn.gradlebasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubprojectoneController {

    @GetMapping("/yo")
    public String getSub() {
        return "Hello, from starter!";
    }
}
