package com.panyukovnn.subprojecttwo.service;

import com.panyukovnn.gradlebasics.model.SubprojectoneUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SubprojecttwoServiceTest {

    @Autowired
    private SubprojecttwoService service;

    @Test
    public void testGetUser() {
        SubprojectoneUser nikolay = service.getNikolay();

        assertEquals(nikolay.getName(), "Nikolay");
        assertEquals(nikolay.getBirthday(), LocalDate.of(2000, 1, 1));
    }

    @Test
    public void testWithOutput() {
        System.out.println("Test from sub-project-2");
    }
}
