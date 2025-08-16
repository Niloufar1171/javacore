package com.niloufar.training.learningspring.testingPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatemethodsTest {
    private Calculatemethods calculatemethods = new Calculatemethods();

    @Test
    public void testHelloPrint(){
        assertEquals("hello",calculatemethods.PrintHello());
    }
    @Test
    public void testDivide(){
        assertEquals(10, calculatemethods.divide(100,10));
    }
    @Test
    public void testDevideByZero(){
        assertThrows(ArithmeticException.class,()-> calculatemethods.divide(100,0));
    }
}