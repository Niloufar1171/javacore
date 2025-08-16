package dailypractice.jan;

import java.util.Arrays;
import java.util.List;

public class jan8 {

    public static void main (String [] args){
        String sentence = "Niloufar is a good programmer";

        List<String> str = Arrays.asList(sentence.split(" "));

        System.out.println(str.get(0));


    }
}
