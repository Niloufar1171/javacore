package com.niloufar.training.learningspring.cracking_code_of_interviewing.chapterSeven.parkinglot;

public class Motorcycle extends Vehicle{

    Motorcycle(){
        spotsNeeded = 1;
        size = VehicleSize.Motorcycle;
    }

    public boolean CanFitInSpot(ParkingSpot spot){
        return true;
    }
}
