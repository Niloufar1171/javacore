package dailypractice.july.july5.prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer,Profession> professionMap  = new Hashtable<>();

    public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {
        Profession cacheProfessionInstacne = professionMap.get(id);
        return (Profession) cacheProfessionInstacne.cloningMethod();
    }
    public static void  loadProfessionCache(){
        Doctor doc = new Doctor();
        doc.id = 1;
        professionMap.put(doc.id, doc);

        Nurse nurse = new Nurse();
        nurse.id = 2;
        professionMap.put(nurse.id, nurse);

        Teacher teacher = new Teacher();
        teacher.id = 3;
        professionMap.put(teacher.id,teacher);

    }
}
