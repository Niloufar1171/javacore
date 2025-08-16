package dailypractice.july.july7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(CheckForRotation("codedecode", "decodedeco"));
        System.out.println(RightRotae("decode",2));
        System.out.println(LeftRotate("decode",2));
    }
    public static char [] findDublicates(String str){
        HashSet<Character> seen = new HashSet<>();
        List<Character> repeatedCharacters = new ArrayList<>();
        for(char c : str.toCharArray()){
            if(!seen.add(c)){
                repeatedCharacters.add(c);
            }
        }
        return repeatedCharacters.toString().toCharArray();
    }
    public static boolean CheckForRotation(String originalString, String rotatedString){
        String Concatinate  = originalString + originalString;
        if(Concatinate.contains(rotatedString))
            return true;
        else return false;
    }
//decode --> (2 left shift) --> code + de
    public static String LeftRotate(String originalString, int rotationNumber){
        //we are going to play with rotation numbers
        String  rotatedString = originalString.substring(rotationNumber) + originalString.substring(0,rotationNumber);
                                                //code (2,len)                      //   de (0,2
    return rotatedString;
    }

//decode -->(2 right shift) --> de + deco
    public static String RightRotae(String originalString, int rotationNumber){
       //partition should be (len - shift numbers) we are playing with parttion = de
        int partition = originalString.length() - rotationNumber; //de
        String rotatedString = originalString.substring(partition) + originalString.substring(0,partition);
                                        //de (4,len)                              //deco(0,4)
        return rotatedString;
    }
}
