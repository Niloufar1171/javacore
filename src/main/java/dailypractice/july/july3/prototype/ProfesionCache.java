package dailypractice.july.july3.prototype;

import java.util.Hashtable;

public class ProfesionCache {
    private static Hashtable<Integer,Profession> professionMap = new Hashtable<>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.clonableMethod();
    }
    public static void loadProfessionCache(){
        Doctor doc = new Doctor();
        doc.id= 1;
        professionMap.put(doc.id,doc);

        Teacher teacher = new Teacher();
        teacher.id= 2;
        professionMap.put(teacher.id,teacher);
    }

}
