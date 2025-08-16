package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large; }

    public boolean CanFitInSpot(ParkingSpot spot){
        return true;
    }
}
