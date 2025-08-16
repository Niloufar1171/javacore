package com.niloufar.training.learningspring.testingPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class processTest {
    @Test
    public void testProcessList(){
        process p = new process();
        p.list.add(1);

        Throwable exception = assertThrows(RuntimeException.class, ()->{
           process p1 = new process();
           p1.list.add(2);
        });
    assertEquals("The list size is not 10!", exception.getMessage());
    }

    @Test
    public void testNameisNotNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            process p= new process();
            p.setName(null);
        });

    }

}