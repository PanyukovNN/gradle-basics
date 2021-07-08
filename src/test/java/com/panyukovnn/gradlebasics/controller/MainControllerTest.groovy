package com.panyukovnn.gradlebasics.controller

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() {
        assertEquals(42, Integer.sum(19, 23));
    }

    @Autowired
    private MainController mainController;

    @Test
    public void testGetMain() {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello from main controller")));
    }

    @Test
    public void yoyoyo() {
        assertEquals("abs", "abc");
    }
}
