package dailypractice.july.july3.prototype;

public class prototypeMain {
    public static void main(String[] args) {
//step1 - load the cache
        ProfesionCache.loadProfessionCache();

        Profession docProfession = ProfesionCache.getCloneNewProfession(1);
        System.out.println(docProfession + " " +docProfession.hashCode());

        Profession teacherProfession = ProfesionCache.getCloneNewProfession(2);
        System.out.println(teacherProfession+ " " + teacherProfession.hashCode());
//we ask again for the object and we get a new object, a clone object
        Profession docProfessionDublicate = ProfesionCache.getCloneNewProfession(1);
        System.out.println(docProfessionDublicate+ " " + docProfessionDublicate.hashCode());

        Profession teacherProfessionDublicate = ProfesionCache.getCloneNewProfession(2);
        System.out.println(teacherProfessionDublicate+ " " +teacherProfessionDublicate.hashCode() );
    }
}
