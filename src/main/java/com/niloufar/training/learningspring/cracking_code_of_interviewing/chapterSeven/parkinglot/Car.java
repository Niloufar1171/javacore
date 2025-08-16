package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

public class Car extends Vehicle{
    Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }
    public boolean CanFitInSpot(ParkingSpot spot){
        return true;
    }
}
