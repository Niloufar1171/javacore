package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
    protected int licensePlate ;
    protected  int spotsNeeded;
    protected VehicleSize size;
}
