package com.panyukovnn.subprojecttwo.service;

import com.panyukovnn.gradlebasics.model.SubprojectoneUser;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SubprojecttwoService {

    public SubprojectoneUser getNikolay() {
        SubprojectoneUser user = new SubprojectoneUser();
        user.setName("Nikolay");
        user.setBirthday(LocalDate.of(2000, 1, 1));

        return user;
    }
}
