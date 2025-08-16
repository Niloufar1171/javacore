package com.niloufar.training.learningspring.patherns.example_Factory;

public class ProfessionFactory {
   // private Profession profession;

    public Profession getProfession(String professionType) {
        if (professionType.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        } else if (professionType.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }else if (professionType.equalsIgnoreCase("Engineer")){
        return new Engineer();
    }
    return  null;
    }
}
