package dailypractice.july.july3.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        ProfessionFactory factory = new ProfessionFactory();

        Profession doc = factory.getProfession(PROFESIONTYPE.DOCTOR);
        doc.print();

        Profession nurse = factory.getProfession(PROFESIONTYPE.NURSE);
        nurse.print();

        Profession teacher = factory.getProfession(PROFESIONTYPE.TEACHER );
        teacher.print();

        };
    }
