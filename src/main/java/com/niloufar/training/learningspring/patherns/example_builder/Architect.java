package com.niloufar.training.learningspring.patherns.example_builder;

import java.awt.*;

public class Architect {

   private CondoBuilder condoBuilder;

    public Architect(CondoBuilder condoBuilder) {
        this.condoBuilder = condoBuilder;
    }
    public House ConstructCondo() {
        return condoBuilder
                .buildFloor(500)
                .buildCeiling(200)
                .paintWallCollor(Color.BLUE)
                .build();
    }

}
