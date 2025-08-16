package com.niloufar.training.learningspring.testingPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATest {
    private A object = new A();

    @Test
    public void testSomething() throws Exception {
        String expected = "";
        assertEquals(object.f(5), expected);
    }
}