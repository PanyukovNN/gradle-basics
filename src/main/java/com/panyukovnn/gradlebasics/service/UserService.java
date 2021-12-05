package com.panyukovnn.gradlebasics.service;

import com.panyukovnn.gradlebasics.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void process() {
        User user = new User("Unknown");

        user.setLogin("John");
    }
}
