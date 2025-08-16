package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

public class Level{
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ParkingSpot[] getSpots() {
        return spots;
    }

    public void setSpots(ParkingSpot[] spots) {
        this.spots = spots;
    }

    public int getAvailableSpot() {
        return availableSpot;
    }

    public void setAvailableSpot(int availableSpot) {
        this.availableSpot = availableSpot;
    }

    public Level(int floor, ParkingSpot[] spots, int availableSpot) {
        this.floor = floor;
        this.spots = spots;
        this.availableSpot = availableSpot;
    }

    private int floor;
    private ParkingSpot[] spots;
    private  int availableSpot = 0;
    private static final int SPOT_PER_ROW =10;
}
