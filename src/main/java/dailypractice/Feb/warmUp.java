package dailypractice.Feb;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Using Scanner
//Convert Int [] to List<Integer> aks Boxing
//Remove Dublicate from a List using hashSet
//Remove ing Dublicated from Array using distinct!

public class warmUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   Scanner sc = new Scanner(new String("hello"));
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name that I recieved is :" +  name);
//*******Convert [] int into array of Integer *************************************************************************************

        int [] array = {1,2,2,3,4,4,4,5,5,6};
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println( " the list in line 22 is : " + list);
        int[] data = {1,2,3,4,5,6,7,8,9,10};
       // To boxed array
       //1
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        //2
        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );
       //3
        int[] aint = {1,2,3,4,5,6,7,8,9,10};
        Integer[] aInt = new Integer[aint.length];
        Arrays.setAll(aInt, i -> aint[i]);
      // To boxed list
        //1
        List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
        //2
        List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );

//***To remove dublicates from an a List using set and Distinct Keyword*************************************************************************************************************************
     Set<Integer > set = new HashSet<>();
     for(int i =0; i < list.size(); i ++){
         if(!set.contains(list.get(i)))
             set.add(list.get(i));
     }
        System.out.println(set);

       List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
       System.out.println("remove dublicated only using distinct on Stream  " + newList);

//************************************************************************************************************************************



    }



}
