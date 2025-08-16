package com.niloufar.training.learningspring;

import java.util.ArrayList;
import java.util.List;

final class Immutable {

    private final String name;
    private final int age;
    private final List<String> hobbies;


    public Immutable(String name, int age, List<String> hobbies){
        this.name = name;
        this.age = age;
        this.hobbies= new ArrayList<>(hobbies);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public List<String> getHobbies() {//using collections!
        return new ArrayList<>(hobbies);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + "}";
    }

}
