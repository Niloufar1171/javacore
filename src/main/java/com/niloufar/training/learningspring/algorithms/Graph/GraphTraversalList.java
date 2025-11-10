package com.niloufar.training.learningspring.algorithms.Graph;

import java.util.*;

public class GraphTraversalList {

    // Build the graph as adjacency list using List<List<Integer>>
    public static List<List<Integer>> buildGraph(int vertices) {
        List<List<Integer>> graph = new ArrayList<>();

        // Initialize each vertex’s adjacency list
        for (int i = 0; i <= vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Create directed edges
        graph.get(1).addAll(Arrays.asList(2, 3));
        graph.get(2).addAll(Arrays.asList(4, 5));
        graph.get(3).add(6);
        graph.get(5).add(6);
        // Nodes 4 and 6 have no outgoing edges

        return graph;
    }

    // BFS Traversal
    public static void bfs(List<List<Integer>> graph, int start) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS Traversal using stack (iterative)
    public static void dfs(List<List<Integer>> graph, int start) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        System.out.print("DFS Traversal: ");

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push neighbors in reverse order for consistent traversal
                List<Integer> neighbors = graph.get(node);
                ListIterator<Integer> it = neighbors.listIterator(neighbors.size());
                while (it.hasPrevious()) {
                    int neighbor = it.previous();
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        int vertices = 6;
        List<List<Integer>> graph = buildGraph(vertices);

        System.out.println("Graph adjacency list:");
        for (int i = 1; i <= vertices; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }

        System.out.println();
        bfs(graph, 1);
        dfs(graph, 1);
    }
}
