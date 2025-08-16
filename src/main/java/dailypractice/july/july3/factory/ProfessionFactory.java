package dailypractice.july.july3.factory;

public class ProfessionFactory{

    public Profession getProfession(  PROFESIONTYPE professiontype) {
       if(professiontype == null)
        return new Profession() {
            @Override
            public void print() {
                Profession.super.print();
            }
        };
       else if(professiontype == PROFESIONTYPE.DOCTOR)
               return  new Doctor();
       else if(professiontype == PROFESIONTYPE.NURSE)
           return new Nurse();
       else if(professiontype == PROFESIONTYPE.TEACHER)
                   return new Teacher();
    return null;
    }
}
