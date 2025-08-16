package com.niloufar.training.learningspring.patherns.example_Prototype;

public class main {
    public static void main(String [] args){
        ProfessionCache.loadProfessionCache();
        //these 2 doctors are different object becasue it clone everytime in creation!
        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);

        Profession teaProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teaProfession);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

    }
}
