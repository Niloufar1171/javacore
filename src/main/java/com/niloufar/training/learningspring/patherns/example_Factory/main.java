package com.niloufar.training.learningspring.patherns.example_Factory;

public class main {
    public static void main(String [] args){
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession doc = professionFactory.getProfession("Doctor");
        doc.printProfession();
    }
}
