package com.niloufar.training.learningspring.java_features.functional_interface;

@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}

