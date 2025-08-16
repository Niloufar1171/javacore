package dailypractice.Feb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feb11 {
    public static void main (String [] args){
        int [] a = new int[3];
        int [] b = {1,2,3};

        Arrays.sort(a);
        Arrays.stream(a).sorted();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<Integer> list3 = list1;
        list1 = list2;

        String s = "niloufar";
        s.length();
        char [] c =s.toCharArray();
       int len = c.length;


    }
}
