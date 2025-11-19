package com.example;

import jakarta.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(ArquillianExtension.class)
public class MyServiceIT {


    @Inject
    private MyService service;


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackages(true, "com.example")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }


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