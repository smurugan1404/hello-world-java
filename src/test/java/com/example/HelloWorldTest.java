package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String expectedGreeting = "Hello, World!";
        String actualGreeting = helloWorld.getGreeting();
        assertEquals(expectedGreeting, actualGreeting, "The greeting should be 'Hello, World!'");
    }
}
