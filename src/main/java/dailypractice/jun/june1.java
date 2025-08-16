package dailypractice.jun;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class june1 {
    public static void main (String [] args) {
//       Scanner sc = new Scanner(new String("hello"));
//        System.out.println(sc.nextLine());
//        sc.close();
//        Scanner sc2 = new Scanner( System.in);
//        System.out.println("Please enter your name");
//        String name = sc2.nextLine();
//        System.out.println("Your name is :" +  name);
        String context = "This is a chapter from a sample context that I want to play with";
       // Arrays.asList(context).stream().forEach(i-> System.out.println(i));
        String[] words = context.split(" ");
       // System.out.println(words[0]);
      //  Arrays.stream(words).forEach(i-> System.out.println(i));
        System.out.println("Length if the longest substring in context is :" + lengthOfLongestReapitingSubString("abcabcbb") );
        System.out.println("context is a subsequence of :" + isSubsequence("abc" , "ahbgdc"));
    }
    public static int lengthOfLongestReapitingSubString( String s){
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0, j =0 ; j < s.length(); j ++){
            if(map.containsKey(s.charAt(j))) {
                i = Math.max((map.get(s.charAt(j))), i);
            }
            res = Math.max(res, j - i  + 1);
            map.put(s.charAt(j),  j + 1 );
        }
        System.out.println(res);
      return res;
    }
    public static boolean isSubsequence(String s, String t){

        int i =0, j = 0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i ++;
            j++;
        }
        return i==s.length();
    }
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for(char c :s.toCharArray()){
            if(map.containsKey(c)) stack.push(c);
            else if (stack.isEmpty() || c!= map.get(stack.pop())) return false;
        }
        return stack.isEmpty();
    }
    public static long maxSubArraySum(int [] nums,int k) {
       long ans = 0, sum = 0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < k ; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
           sum = sum + (long)nums[i];
       }
       int l= 0;
       for(int i = k; i < nums.length; i ++){
           sum = sum - (long) nums[l];
           sum = sum + (long) nums[i];

           map.put(nums[l],map.get(nums[l] -1 ));

       }
        return ans;
    }

}
