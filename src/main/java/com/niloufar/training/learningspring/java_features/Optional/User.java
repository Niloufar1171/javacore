package com.niloufar.training.learningspring.java_features.Optional;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> email; // email is optional

    public User(String name, Optional<String> email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
