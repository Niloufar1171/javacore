package dailypractice.july.july3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class july3 {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
     for(int i =0; i < 100 ; i++){
         mylist.add(i *i);
     }
        List<String> strlist = new ArrayList<>();
        strlist.add("Tehran");
        strlist.add("Montreal");
        strlist.add("Calgery");
        strlist.add("Seatle");

     //get the even numbers
        System.out.println("***Using filter **********************************************************************");
       mylist.stream().filter(i->i%2==0).forEach(x -> System.out.print( x +","));
        System.out.println("\n");

     //get the even numbers and put them in a seperate list
        System.out.println("***Using filter and collect **********************************************************************");
        List<Integer> evenNumbers = mylist.stream().filter(x->x%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("***Using count **********************************************************************");
        int countEvenNumbers = (int) mylist.stream().filter(i-> i%2 ==0).count();
        System.out.println("Number of the element that is even in the lsit : " + countEvenNumbers);

        System.out.println("*** sorting/Reverse sorting on list of Wrappers! **********************************************************************");
        List<Integer> OrderOfEvenNumber = mylist.stream().filter(i-> i%2 == 0).sorted( ).collect(Collectors.toList());
        //List<Integer> DscOrderOfEvenNumber = mylist.stream().filter(i-> i%2 == 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> DscOrderOfEvenNumber = mylist.stream().filter(i-> i%2 == 0).sorted((o1,o2)-> o2.compareTo(o1) ).collect(Collectors.toList());

        List<String> sortingStringList = strlist.stream().sorted().collect(Collectors.toList());
        List<String> DscsortingStringList = strlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(DscsortingStringList);

    }
}
