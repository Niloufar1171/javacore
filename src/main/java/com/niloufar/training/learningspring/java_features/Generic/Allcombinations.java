package com.niloufar.training.learningspring.java_features.Generic;
    import java.util.*;
    class CombinationGenerator {

        // Recursive function to generate combinations
        public static <T> void generateCombinations(List<List<T>> lists, List<T> current, int depth) {
            // Base case: if we've reached the end of the lists
            if (depth == lists.size()) {
                // Print the current combination
                System.out.println(current);
                return;
            }

            // Recursively iterate through each list
            for (T item : lists.get(depth)) {
                // Add the current item to the combination and recurse
                current.add(item);
                generateCombinations(lists, current, depth + 1);
                // Backtrack: remove the last added item
                current.remove(current.size() - 1);
            }
        }

        public static void main(String[] args) {
            // Example lists of objects
            List<String> list1 = Arrays.asList("a1", "a2", "a3");
            List<String> list2 = Arrays.asList("b1", "b2");
            List<String> list3 = Arrays.asList("c1", "c2", "c3");

            // Create a list of all lists
            List<List<String>> lists = Arrays.asList(list1, list2, list3);

            // Call the function to generate and print all combinations
            generateCombinations(lists, new ArrayList<>(), 0);
        }
    }


