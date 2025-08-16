package com.niloufar.training.learningspring.testingPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClusterTest {
    Logger LOGGER = LogManager.getLogger();
    Cluster c = new Cluster();

    @Test
    public void testNumber() {
        String device_id = "xx";
        String device_value = "id";
        String value = "15b";
        assertThrows(NumberFormatException.class, () -> c.addToCluster());
    }
}