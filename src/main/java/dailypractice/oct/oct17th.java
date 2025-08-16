package dailypractice.oct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class oct17th {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
    public static  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        // atee : a :1, t : 1 , e : 2
        //eate : e : 2 , a : 1, t:1
        // loop through
        List<Map<Character, Integer>> listmap = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
       for(int i = 0; i < strs.length - 1  ; i ++){
            for (Character c : strs[i].toCharArray()) {
                listmap.get(i).put(c, map.getOrDefault(c, 0) + 1);
            }

        }
        System.out.println(listmap);
        return  res;
    }
    }
