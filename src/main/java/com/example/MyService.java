package com.example;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MyService {


    public String sayHello(String name) {
        return "Hello " + name;
    }
}
