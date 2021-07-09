package com.panyukovnn.subprojecttwo.service;

import com.panyukovnn.gradlebasics.model.SubprojectoneUser;
import org.gradle.internal.impldep.org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;

@SpringBootTest
public class SubprojecttwoServiceTest {

    @Autowired
    private SubprojecttwoService service;

    @Test
    public void testGetUser() {
        SubprojectoneUser nikolay = service.getNikolay();

        assertEquals(nikolay.getName(), "Nikolay");
        assertEquals(nikolay.getBirthday(), LocalDate.of(1994, 1, 1));
    }
}
