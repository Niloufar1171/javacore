package dailypractice.may;

import java.util.Arrays;
import java.util.HashMap;
//more practice is needed
public class may26 {
    public static void main (String [] args){

    }
    public static int findUniqueCharacter(String s ){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1 );//l : 2 , e :0 , b :3
        }
       for(int i = 0 ; i < s.length() ; i ++){
           if(map.get(s.charAt(i)) == 1) return i;
       }
        return -1;
    }
    public static boolean isAnagram(String s, String t){
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        return Arrays.equals(str1, str2);
    }
//    public static boolean isPalidrome(String s ){
//        StringBuilder sb = new StringBuilder(s);
//        Arrays.asList(s.toCharArray()).stream().filter(c -> Character.isLetterOrDigit(c) ).mapToObj(c-> Character.toLowerCase())
//    }
    public static int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()) return -1;

        for(int i = 0 ; i <= haystack.length() - needle.length(); i ++){
            int j;
            for (j = 0; j < needle.length(); j ++){
                if(haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if(j == needle.length() ) return i;
        }
        return -1;
    }
public static String longestCommonprefix(String [] str){
        if(str.length == 0) return "";

        for(int i = 0 ; i < str[0].length(); i++){
            for(int j = 1 ; j< str.length; j ++){
                if (i == str[j].length() || str[j].charAt(i) != str[0].charAt(i))
                    return str[0].substring(0,i);
            }
        }
        return str[0];
}
//public class ListNode{
//        int val;
//        ListNode  next;
//        ListNode (int x ) {val = x;}
//}
//public static void deleteNode(ListNode node){
//        ListNode nextNode = node.next;
//
//        node.val = nextNode.val;
//        node.next = nextNode.next;
//
//        nextNode.next = null;
//}

}
