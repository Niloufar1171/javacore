package com.niloufar.training.learningspring.patherns.example_Prototype;

import java.util.Hashtable;

public class ProfessionCache {

    private  static Hashtable<Integer, Profession> professionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id ){
        Profession cacheProfessionInstance = professionMap.get(id);
        return (Profession) cacheProfessionInstance.cloningMethod();
    }
//Create the map! because it was costly we want to do it once!

    public static void loadProfessionCache(){
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id,doc);

        Engineer eng = new Engineer();
        eng.id = 2;
        professionMap.put(eng.id, eng);

        Teacher tea = new Teacher();
        tea.id = 3;
        professionMap.put(tea.id, tea);

    }
}
