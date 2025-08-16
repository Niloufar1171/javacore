package dailypractice.july.july4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();

        for(int i =0; i < 100 ; i++){
            mylist.add(i *i);
        }

        // error!
//        List<Integer> usingtiArray1 = mylist.stream().filter(i->i%2==0).toArray();
      //
        List<Integer> usingtiArray2= mylist.stream().filter(i->i%2==0).collect(Collectors.toList());
        Object[] usingtiArray3= mylist.stream().filter(i->i%2==0).toArray();
        //Using Of
        Stream.of(11,222,333,1111).forEach(x-> System.out.println(x));
        String [] str = {"a","b","c"};
        Stream.of(str).forEach(x-> System.out.println(x));

        Predicate<Integer> checkEvenNumber = i-> i %2 ==0;
        System.out.println("check if the number is Even : " + checkEvenNumber.test(5));
    }
}
