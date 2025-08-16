package com.niloufar.training.learningspring.java_features.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        User userWithEmail = new User("Alice", Optional.of("alice@example.com"));
        User userWithoutEmail = new User("Bob", Optional.empty());

        printEmail(userWithEmail);
        printEmail(userWithoutEmail);
//---chain with map
        Optional<String> email = Optional.of("abc@example.com");
        int length = email.map(String::length).orElse(0);
        System.out.println("Email length: " + length);
    }

    public static void printEmail(User user) {
        // Check if email is present
        user.getEmail().ifPresentOrElse(
                email -> System.out.println(user.getName() + "'s email: " + email),
                () -> System.out.println(user.getName() + " has no email.")
        );
    }
}
