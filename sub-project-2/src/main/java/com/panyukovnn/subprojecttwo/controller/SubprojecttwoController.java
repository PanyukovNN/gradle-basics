package com.panyukovnn.subprojecttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubprojecttwoController {

    @GetMapping("/")
    public String getSub() {
        return "Hello from sub-project-2";
    }
}
