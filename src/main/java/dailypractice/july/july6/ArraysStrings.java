package dailypractice.july.july6;

import java.util.*;

public class ArraysStrings {
    public static void main(String[] args) {
        //1 revese, Palidrom
        revese("hello");
        System.out.println(isPalidrom("nno"));
        //2 revese a sentence , remove dublicate from string
        ReverseAllWords("This is a senctence of which I am talking out! ");
        //3 2Sum
        TwoSum(new int[]{1,2,4,6,7,13}, 9);
        //removeDublicates
        removeDublicates("abbacccs");

        //group anagrom

        //array initiate
       // groupAnagrams(new String[] { "apple", "banana", "orange", "kiwi" });

        // -6 RemoveDublicates fromn array
        //-7 containsDuplicate
        // - 9 remove dublicates in sorterd
        // -8 SingleNumber
        //print all sub arrays

    }

    public static  void revese(String str ){
        int i =0;
        int j = str.length() -1 ;
        char [] chars = str.toCharArray();
        while(i < j){
            char c = str.charAt(i);
            chars[i] = chars[j];
            chars[j] = c;

            i ++;
            j --;
        }
        System.out.println(String.valueOf(chars));
    }
    public static boolean isPalidrom(String str ){
        int i = 0;
        int j = str.length() - 1;
        while ( i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public  static void ReverseAllWords(String str){
        List<String> words = new ArrayList<>();

        words = Arrays.asList(str.split(" "));
        for ( int i = 0; i <= words.size() -1 ; i ++){
            StringBuilder revese = new StringBuilder(words.get(i));
            words.set(i,revese.toString());
        }

        System.out.println(words);
    }
    public static void removeDublicates (String str){
        //abbc --> aba
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < str.length() - 1; i ++){
            if(seen.add(str.charAt(i))){
                sb.append(str.charAt(i));

            }
        }
        System.out.println(sb);
    }
    public static void TwoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length -1 ; i++){
            int complete = target - nums[i];
            if(map.containsKey(complete)){
                System.out.println(map.get(complete)+ " , " + i );
            }
            map.put(nums[i], i);
        }
    }

}
