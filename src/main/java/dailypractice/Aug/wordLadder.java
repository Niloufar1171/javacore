//package dailypractice.Aug;
//
//import org.springframework.data.util.Pair;
//import java.util.*;
//
//public class wordLadder {
//
//    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        String[] str =  {"hot","dot","dog","lot","log","cog"};
//        stringList.addAll(List.of(str));
//
//       wordLadder wl =  new wordLadder();
//       wl.ladderLength("hit", "cog", stringList );
//
//    }
//    class Solution {
//        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//            int L = beginWord.length();
//            Map<String, List<String>> allComboDict = new HashMap<>();
//
//            for(String word : wordList){
//                for (int i = 0; i < beginWord.length(); i++) {
//                    String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
//                    allComboDict.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);
//                }
//            }
//            Queue<Pair<String, Integer>> Q = new LinkedList<>();
//            Q.add(new Pair(beginWord, 1));
//            Map<String, Boolean> visited = new HashMap<>();
//            visited.put(beginWord, true);
//
//            while (!Q.isEmpty()) {
//                Pair<String, Integer> node = Q.remove();
//                String word = node.getKey();
//                int level = node.getValue();
//                for (int i = 0; i < beginWord.length(); i++) {
//
//                    String newWord = word.substring(0, i) + '*' + word.substring(i + 1, beginWord.length());
//                    for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
//                        if (adjacentWord.equals(endWord)) {
//                            return level + 1;
//                        }
//                        if (!visited.containsKey(adjacentWord)) {
//                            visited.put(adjacentWord, true);
//                            Q.add(new Pair(adjacentWord, level + 1));
//                        }
//                    }
//                }
//            }
//            return 0;
//        }
//    }
//}
