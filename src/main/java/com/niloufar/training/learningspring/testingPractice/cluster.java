package com.niloufar.training.learningspring.testingPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Cluster {
    Logger LOGGER = LogManager.getLogger();

    public void addToCluster(){

        String device_id = "xx";
        String device_value = "id";
        String value = "15b";
        Integer number =0;
        try {
            Integer i = Integer.valueOf(value);
            number = i;
        } catch (NumberFormatException numberError) {
            LOGGER.error(String.format("Error parsing value of %s of device number %s becasue of %s", value, device_id, numberError.getMessage()));
        }
    }
}
