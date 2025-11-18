package com.niloufar.training.learningspring.Multithreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/*
You have a configuration that’s loaded from a file or database once, and then read concurrently by many threads.

Config() {
        // Simulate expensive load
        settings = new HashMap<>();
        settings.put("env", "prod");
        settings.put("region", "us-east");
    }

 Problem:
The reader thread might see a partially constructed Config object, meaning settings is null or half-filled, even though the constructor ran.
Why? Because writes in one thread aren’t guaranteed to be visible to others without synchronization. So sometimes you could get a NullPointerException or see null values.
by using final :
settings is visible to all threads once the object is constructed.
The map itself is immutable → no synchronization needed for reads.
All threads see a fully constructed Config once config reference is published.
No race conditions, no stale or partial data.
 */
class Config {
    private final Map<String, String> settings;//--> make it final

    Config() {
        Map<String, String> temp = new HashMap<>();
        temp.put("env", "prod");
        temp.put("region", "us-east");
        settings = Collections.unmodifiableMap(temp);
    }

    String get(String key) {
        return settings.get(key);
    }
}

class ConfigManager {
    private static Config config; // shared reference so we wont need to make this final !

    public static void init() {
        config = new Config(); // publish once, fully built
    }

    public static Config getConfig() {
        return config;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread writer = new Thread(ConfigManager::init);
        writer.start();
        writer.join(); // Ensure config is ready before readers

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                Config cfg = ConfigManager.getConfig();
                if (cfg != null) {
                    System.out.println(Thread.currentThread().getName() + " -> " + cfg.get("env"));
                }
            }).start();
        }
    }
}
