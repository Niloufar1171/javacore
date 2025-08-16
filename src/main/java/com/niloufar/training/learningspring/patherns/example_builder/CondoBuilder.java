package com.niloufar.training.learningspring.patherns.example_builder;

import java.awt.*;

public class CondoBuilder implements HouseBuilder {
    private House house;

    public CondoBuilder() {
    }
//=================================================================
    @Override
    public HouseBuilder setDimension(Dimension dimension) {
        house.setDimension(dimension);
        return this;
    }

    @Override
    public HouseBuilder buildFloor(int floorNumber) {
        house.setFloorNumber(floorNumber);
        return this;
    }

    @Override
    public HouseBuilder paintWallCollor(Color wallCollor) {
        house.setWallCollor(wallCollor);
        return this;
    }

    @Override
    public HouseBuilder buildWindows(int numberOfWindows) {
        house.setNumberOfWindows(numberOfWindows);
        return this;
    }

    @Override
    public CondoBuilder buildCeiling(int ceilingHeight) {
        house.setCeilingHeight(ceilingHeight);
        return this;
    }
    //=================================================================
    @Override
    public House build() {
        return new House();
    }
}