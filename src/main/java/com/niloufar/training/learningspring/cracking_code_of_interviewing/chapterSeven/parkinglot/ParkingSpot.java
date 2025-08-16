package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private  Level level ;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(VehicleSize spotSize) {
        this.spotSize = spotSize;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public ParkingSpot(Vehicle vehicle, VehicleSize spotSize, int row, int spotNumber, Level level) {
        this.vehicle = vehicle;
        this.spotSize = spotSize;
        this.row = row;
        this.spotNumber = spotNumber;
        this.level = level;
    }

    public  boolean park(Vehicle v) {return true;}
    public void removeVahicle(){}
    public boolean isAvailable(){return true;}
}
