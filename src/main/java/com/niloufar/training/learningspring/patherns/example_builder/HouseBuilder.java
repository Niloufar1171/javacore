package com.niloufar.training.learningspring.patherns.example_builder;

import java.awt.*;

public interface HouseBuilder {
    //constructors
    HouseBuilder setDimension(Dimension dimension);

    HouseBuilder buildFloor(int floorNumber);

    HouseBuilder paintWallCollor(Color wallCollor);

    HouseBuilder buildWindows(int numberOfWindows);

    CondoBuilder buildCeiling(int ceilingHeight);

    House build();

   // String toString();

}
