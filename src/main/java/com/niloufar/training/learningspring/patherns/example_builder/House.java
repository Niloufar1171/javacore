package com.niloufar.training.learningspring.patherns.example_builder;

import java.awt.*;

public class House {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallCollor;
    private int numberOfWindows;

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Color getWallCollor() {
        return wallCollor;
    }

    public void setWallCollor(Color wallCollor) {
        this.wallCollor = wallCollor;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

//    public House(Dimension dimension, int ceilingHeight , int floorNumber , Color wallCollor , int numberOfWindows) {
//        this.dimension = dimension;
//        this.ceilingHeight = ceilingHeight;
//        this.floorNumber = floorNumber;
//        this.wallCollor = wallCollor;
//        this.numberOfWindows = numberOfWindows;
//    }

    @Override
    public String toString() {
        return "House{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorNumber=" + floorNumber +
                ", wallCollor=" + wallCollor +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}

