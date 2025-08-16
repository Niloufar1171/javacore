//package com.niloufar.training.learningspring.collections;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@SpringBootApplication
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("hello from main in collections");
/////------------------------------------------------------------------------------------------------
//
//        LinkedList<String>  phoneBook = new LinkedList<>();
//
//        phoneBook.add("niloufar");
//        phoneBook.add("Behrouzy");
//        System.out.println(phoneBook.getFirst());
//
//        customLinkedList nodes = new customLinkedList();
//        customLinkedList.Node newN = new customLinkedList.Node( "hi");
//
//        customLinkedList list  = new customLinkedList();
//        list.customLinkedListInsert(list,"data");
//        list.customLinkedListInsert(list,"2");
//        list.customLinkedListInsert(list,"3");
//        list.customLinkedListInsert(list,"4");
//        list.customLinkedListInsert(list,"5");
//        list.customLinkedListInsert(list,"6");
//
//        customLinkedList.customLinkedListPrint(list);
//
//        printArray(new String[]{"my", "name", "is"});
//        printArrayStream(new String[]{"my", "name", "is"});
//        System.out.println(mostCommonWord());
//        priorityQ();
//
//    }
//
//    public static void printArray(String [] arr){
//
//        for (String str: arr)
//        {
//            System.out.println(str);
//        }
//    }
//
//    public static void  printArrayStream(String [] arr){
//        String paragragh = "\"Bob hit a ball, the hit BALL flew far after it was hit.\"";
//
//        Set<String> bannedSet = Arrays.stream(arr).collect(Collectors.toSet());
//
//        Map<String,Integer> count = new HashMap<>();
//
//
//        Stream<String> arrStream = Arrays.stream(arr);
//        arrStream.forEach(str-> System.out.println(str));
//
//
//
//
//    }
//
//    public static String mostCommonWord(){
//        String paragragh = "\"Bob hit a ball, the hit BALL flew far after it was hit.\"";
//        String [] banned = {"hit"};
//
//        Set<String> bannedSet = Arrays.stream(banned).collect(Collectors.toSet());
//
//        Map<String,Integer> count = new HashMap<>();
//
//        Arrays.stream(paragragh.replaceAll("[^a-zA-Z0-9]+"," ").split(" "))
//                .map(String ::toLowerCase)
//                .peek(System.out::println)
//                .filter(word->!bannedSet.contains(word))
//                .forEach(word-> count.put(word,count.getOrDefault(word,0)+1));
//
//
//        return count.entrySet()
//                .stream()
//                .max(Comparator.comparing(Map.Entry::getValue))
//                .map(Map.Entry::getKey)
//                .orElse("");
//
//
//    }
//
//    public static void priorityQ (){
//
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//
//         pq.add(10);
//         pq.add(20);
//         pq.add(2);
//
//        System.out.println(pq.peek());
//    }
//}
