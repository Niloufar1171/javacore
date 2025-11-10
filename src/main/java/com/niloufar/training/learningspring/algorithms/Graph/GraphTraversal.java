package com.niloufar.training.learningspring.algorithms.Graph;
import java.util.*;

public class GraphTraversal {

    // Build the graph using adjacency list
    public static Map<Integer, List<Integer>> buildGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6));
        graph.put(4, Collections.emptyList());
        graph.put(5, Arrays.asList(6));
        graph.put(6, Collections.emptyList());

        return graph;
    }

    // BFS Traversal
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS Traversal (iterative with stack)
    public static void dfs(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        System.out.print("DFS Traversal: ");

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                // To maintain natural order (left-to-right)
                List<Integer> neighbors = graph.getOrDefault(node, Collections.emptyList());
                ListIterator<Integer> it = neighbors.listIterator(neighbors.size());
                while (it.hasPrevious()) {
                    int neighbor = it.previous();
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = buildGraph();

        System.out.println("Graph adjacency list:");
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        bfs(graph, 1);
        dfs(graph, 1);
    }
}
