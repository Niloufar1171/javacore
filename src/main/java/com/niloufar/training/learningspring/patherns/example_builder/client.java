package com.niloufar.training.learningspring.patherns.example_builder;

public class client {
    public static void main(String[] args) {
        HouseBuilder condoBuilder = new CondoBuilder();
        Architect architect = new Architect((CondoBuilder) condoBuilder);
        House condo = architect.ConstructCondo();

       // System.out.println(condo);

    }
}
