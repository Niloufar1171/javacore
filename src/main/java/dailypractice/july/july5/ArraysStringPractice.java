package dailypractice.july.july5;

import java.util.*;

public class ArraysStringPractice {
    public static void main(String[] args) {
        //1
        reverseString("Hello");
        //2
        reveseEachWord("let me see the reverse of this");

        //3
        getTwoSum(new int []{1,7,2,11,13},9 );
        //4
        removeDublicateString("abbcdd");
        //5 

    }
    public static void reverseString(String str){
        int i = 0;
        int j = str.length() - 1 ;
        char [] chars = str.toCharArray();
        while (i < j){
            char c = str.charAt(i);
            chars[i] = chars[j];
            chars [j] = c;

            i ++;
            j--;
        }
        System.out.println("the reveses String is : " + String.valueOf( chars ));
    }

    public static void reveseEachWord(String str){
        List<String> words = new ArrayList<>();
        words =Arrays.asList(str.split(" "));

        for (int i = 0; i < words.size() -1 ; i++){
            StringBuilder sb = new StringBuilder(words.get(i));
            words.set(i,sb.reverse().toString());
        }
        System.out.println(words);
    }
    public static void getTwoSum(int [] nums , int target){
        //complete = target - nums[i]
        //map : 2 : 0 , 7 : 1 ,
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length -1 ; i ++){
            int complete = target - nums[i];
            if(map.containsKey(complete)){
                System.out.println( "the Indexes are :[ " + map.get(complete)+", " +  i + "]");
            }
            map.put(nums[i], i);
        }
    }
    public static void removeDublicateString(String str){
        //abbc ---> abc
        //map a : 1 , b : 2
        char [] chars = str.toCharArray();
        Set<Character> seen =new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length() -1 ; i ++){
            if (seen.add(str.charAt(i))){
                sb = sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
