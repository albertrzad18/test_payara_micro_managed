package com.example;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceIT extends BaseIntegrationTest {

    @Inject
    private MyService service;


    @Test
    void correct() {
        String result = service.sayHello("World");
        assertEquals("Hello World", result);
    }

    @Test
    void fail() {
        String result = service.sayHello("World");
        assertEquals("fail", result);
    }
}