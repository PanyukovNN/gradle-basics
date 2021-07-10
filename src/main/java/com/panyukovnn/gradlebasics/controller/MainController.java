package com.panyukovnn.gradlebasics.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> getMain() {
        return ResponseEntity.ok("Hello from main controller");
    }
}
