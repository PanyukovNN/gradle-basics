package com.panyukovnn.gradlebasics.controller;

import com.panyukovnn.gradlebasics.model.SubprojectoneUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SubprojectoneController {

    @GetMapping("/")
    public String getSub() {
        SubprojectoneUser user = new SubprojectoneUser();
        user.setName("Ivan");
        user.setBirthday(LocalDate.now());

        return "Hello, from sub-project-1!";
    }
}
